package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.data.CarRepository;
import com.revature.model.Car;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {
	
	@Autowired
	CarRepository carRepo;
	
	@RequestMapping(value = "/find", method=RequestMethod.GET,  
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Car> findAvailable(){
		return carRepo.findByStatusIgnoreCase("available");
	}
}
