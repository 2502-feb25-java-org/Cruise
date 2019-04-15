package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.data.RiderRepository;
import com.revature.model.Rider;

@RestController
@RequestMapping("/rider")
@CrossOrigin
public class RiderController {
	
	@Autowired
	RiderRepository riderRepo;
	
	@RequestMapping(value ="/add", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Rider add(@RequestBody Rider rider){
		return riderRepo.save(rider);
	}
	
	@RequestMapping(value ="/update", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Rider update(@RequestBody Rider rider){
		if (rider.getId() != 0)
			return riderRepo.save(rider);
		else
			return null;
	}
	
	@RequestMapping(value ="/find", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Rider find(@RequestBody String credentials[]){
		Rider rider = riderRepo.findByUsernameIgnoreCaseAndPassword(credentials[0], credentials[1]);
		System.out.println("Found " + rider);
		if (rider != null) {
			return rider;
		}
		else
			return null;
	}
}
