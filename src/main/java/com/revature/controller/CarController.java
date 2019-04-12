package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.data.CarRepository;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {
	
	@Autowired
	CarRepository carRepo;
	
	

}
