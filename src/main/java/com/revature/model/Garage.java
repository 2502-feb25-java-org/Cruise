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
public class Garage {
	
	@Id
	@Column(name="GARAGE_ID")
	@SequenceGenerator(name="GARAGE_ID_GEN", sequenceName="GARAGE_SEQ", allocationSize=1)
	@GeneratedValue(generator="GARAGE_ID_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable=false)
	private Address location;
	
	@Column(nullable=false)
	private int maxCapacity;
	
	@Column(nullable=false)
	private int spacesLeft;

}
