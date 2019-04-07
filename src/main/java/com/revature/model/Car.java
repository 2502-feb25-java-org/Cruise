package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Car {
	
	@Id
	@Column(name="CAR_ID")
	@SequenceGenerator(name="CAR_ID_GEN", sequenceName="CAR_SEQ", allocationSize=1)
	@GeneratedValue(generator="CAR_ID_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable=false)
	private String make;
	
	@Column(nullable=false)
	private String model;
	
	@Column(nullable=false)
	private int maxCapacity;
	
	@Column(nullable=false)
	private int seatsLeft;
	
	@Column(nullable=false)
	private Address location;
}
