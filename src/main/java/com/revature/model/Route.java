package com.revature.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(cascade=CascadeType.REMOVE, fetch=FetchType.EAGER)
	@JoinColumn(name="START_ADDRESS_ID", nullable=false)
	private Address start;
	
	@ManyToOne(cascade=CascadeType.REMOVE, fetch=FetchType.EAGER)
	@JoinColumn(name="DESTINATION_ADDRESS_ID", nullable=false)
	private Address destination;
	
	@Column(nullable=false)
	private Double distance;
	
	@Column(nullable=false)
	private long duration;

	public Route() {}

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

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
}
