package com.sruthi.rest.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.sruthi.rest.Exception.ResourceNotFoundException;
import com.sruthi.rest.Exception.ResourceNotModifiedException;
import com.sruthi.rest.Repository.PassengerRepository;
import com.sruthi.rest.entity.Passenger;
import com.sruthi.rest.entity.Train;
@Service
public class PassengerService 
{
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    PassengerRepository passengerRepository;
    
    @Transactional(readOnly=true)
    public List<Passenger> getAllPassenger()
    {
    	return passengerRepository.findAll();
    }
  
    @Transactional(readOnly=true)
    public Passenger getPassengerByPassengerId(int passengerId)
    {
    	Optional<Passenger> p =passengerRepository.findById(passengerId);
    	if(p.isPresent())
    	{
    		Passenger passenger = p.get();
    		Train train = restTemplate.getForEntity("http://localhost:8090/train/"+passenger.getTrainId(),Train.class).getBody();
    		passenger.setTrain(train);
    		return passenger;
    		
    	}
    	return null;
    }
  
  
    @Transactional(readOnly=true)
    public Passenger getPassengerByPassengername(String passengername)
    {
    	Optional<Passenger> p1 =passengerRepository.findByPassengername(passengername);
    	if(p1.isPresent())
    		return p1.get();
    	return null;
    }
    
    @Transactional
    public void insertOrModify(Passenger passenger)
    {
    	if(passengerRepository.save(passenger)==null)
    		throw new ResourceNotModifiedException();
    }
    
    
    @Transactional
    public boolean deletePassengerByPassengerId(int passengerId)
    {
    	long count = passengerRepository.count();
    	if(count>passengerRepository.count())
		 return true;
	 throw new ResourceNotFoundException();
    }
    
}
