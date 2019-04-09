package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.data.RiderRepository;
import com.revature.model.Rider;

@RestController
@RequestMapping("/rider")
public class RiderController {
	
	@Autowired
	RiderRepository riderRepo;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Rider> add(@RequestBody Rider rider){
		return new ResponseEntity<Rider>(riderRepo.save(rider), HttpStatus.CREATED);
	}
	

}
