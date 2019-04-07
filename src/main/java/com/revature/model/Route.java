package com.revature.model;


import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Route {
	
	@Id
	@Column(name="ROUTE_ID")
	@SequenceGenerator(name="ROUTE_ID_GEN", sequenceName="ROUTE_SEQ", allocationSize=1)
	@GeneratedValue(generator="ROUTE_ID_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable=false)
	Address start;
	
	@Column(nullable=false)
	Address destination;
	
	@Column(nullable=false)
	Double distance;
	
	@Column(nullable=false)
	Duration duration;
	
}
