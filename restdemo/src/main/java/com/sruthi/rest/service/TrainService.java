package com.sruthi.rest.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sruthi.rest.Exception.ResourceNotModifiedException;
import com.sruthi.rest.Exception.ResourceNotFoundException;
import com.sruthi.rest.Repository.TrainRepository;
import com.sruthi.rest.entity.Train;
@Service
public class TrainService
{
  @Autowired
    TrainRepository trainRepository;
    @Transactional(readOnly=true)
    public List<Train> getAllTrains()
    {
        return trainRepository.findAll();
    }
    
 @Transactional(readOnly=true)
    public Train getTrainByTrainId(int trainId)
    {
        Optional<Train> ot = trainRepository.findById(trainId);
        if(ot.isPresent())
            return ot.get();
        throw new ResourceNotFoundException();
    }

 @Transactional
 public void insertOrModifyTrain(Train train)
 {
	if(trainRepository.save(train) ==null)
		
	throw new ResourceNotModifiedException();
 }
 
 @Transactional
 public boolean deleteTrainByTrainId(int trainId)
 {
	 long count=trainRepository.count();
	 trainRepository.deleteById(trainId);
	 if(count>trainRepository.count())
		 return true;
	 throw new ResourceNotFoundException();
 }
 
}

