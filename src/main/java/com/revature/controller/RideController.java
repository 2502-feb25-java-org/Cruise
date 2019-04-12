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
	
	@Autowired
	RiderRepository riderRepo;
	
	@RequestMapping(value ="/add", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Ride> add(@RequestBody Ride ride){
		System.out.println(ride);
		return new ResponseEntity<Ride>(rideRepo.save(ride), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/get", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ride>> validateUser(@RequestBody String username){
		Rider rider = riderRepo.findByUsernameIgnoreCase(username);
		if (rider != null) {
			List<Ride> rides = rideRepo.findByRider(rider);
			if (rides.size() != 0)
				return new ResponseEntity<List<Ride>>(rides, HttpStatus.FOUND);
		}
		return new ResponseEntity<List<Ride>>(new ArrayList<Ride>(), HttpStatus.NOT_FOUND);
	}
	
	

}
