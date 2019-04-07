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

	public Route() {}

	public Route(Address start, Address destination, Double distance, Duration duration) {
		super();
		this.start = start;
		this.destination = destination;
		this.distance = distance;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getStart() {
		return start;
	}

	public void setStart(Address start) {
		this.start = start;
	}

	public Address getDestination() {
		return destination;
	}

	public void setDestination(Address destination) {
		this.destination = destination;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}
}
