package com.sruthi.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sruthi.rest.Exception.ResourceNotModifiedException;
import com.sruthi.rest.entity.Passenger;
import com.sruthi.rest.service.PassengerService;
@RequestMapping("/passenger")
@RestController
public class PassengerController 
{
	@Autowired
	PassengerService passengerService;
	
	@GetMapping("/")
	public ResponseEntity<List<Passenger>> getAllPassenger()
	{
		List<Passenger> plist = passengerService.getAllPassenger();
		if(plist.size()!=0)
			return new ResponseEntity<List<Passenger>>(plist,HttpStatus.OK);
		return new ResponseEntity<List<Passenger>>(plist,HttpStatus.NOT_FOUND);
	}
  
	@GetMapping("/{passengerId}")
	public ResponseEntity<Passenger> getByPassengerId(@PathVariable int passengerId)
	{
		Passenger p = passengerService.getPassengerByPassengerId(passengerId);
		if(p!=null)
			return new ResponseEntity<Passenger>(p,HttpStatus.OK);
		return new ResponseEntity<Passenger>(p,HttpStatus.NOT_FOUND);
			
	}
	
	@GetMapping("/abc/{passengername}")
	public ResponseEntity<Passenger> getByPassengername(@PathVariable String passengername)
	{
		Passenger p1 = passengerService.getPassengerByPassengername(passengername);
		if(p1!=null)
			return new ResponseEntity<Passenger>(p1,HttpStatus.OK);
		return new ResponseEntity<Passenger>(p1,HttpStatus.NOT_FOUND);
			
	}
	
	
	@PostMapping(consumes="application/json")
	public HttpStatus insertPassenger(@RequestBody Passenger passenger)
	{
		passengerService.insertOrModify(passenger);
			return HttpStatus.OK;
		
	}
	
	@PutMapping(consumes="application/json")
	public HttpStatus modifyPassenger(@RequestBody Passenger passenger)
	{
		passengerService.insertOrModify(passenger);
			return HttpStatus.OK;
		
	}
	
	@DeleteMapping(value="/{passengerId}",consumes="application/json")
	public HttpStatus deletePassenger(@PathVariable int passengerId)
	{
		if(passengerService.deletePassengerByPassengerId(passengerId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	 @ExceptionHandler(ResourceNotModifiedException.class)
	    public HttpStatus notModifiedExceptionHandler()
	    {
	    	return HttpStatus.NOT_MODIFIED;
	    }
}
