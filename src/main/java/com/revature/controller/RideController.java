package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.data.RideRepository;
import com.revature.data.RiderRepository;
import com.revature.model.Ride;
import com.revature.model.Rider;

@RestController
@RequestMapping("/ride")
@CrossOrigin
public class RideController {
	
	@Autowired
	RideRepository rideRepo;
	
	@RequestMapping(value ="/add", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Ride add(@RequestBody Ride ride){
		//System.out.println(ride);
		return rideRepo.save(ride);
	}
	
	@RequestMapping(value ="/update", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Ride update(@RequestBody Ride ride){
		//System.out.println(ride);
		if (ride.getId() != 0)
			return rideRepo.save(ride);
		else 
			return null;
	}
	
	@RequestMapping(value = "/find", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Ride> find(@RequestBody int riderId){
		return rideRepo.findByRiderId(riderId);
	}
}
