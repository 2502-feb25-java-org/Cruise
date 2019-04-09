package com.revature.model;

import java.time.LocalDateTime;

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
public class Ride {
	
	@Id
	@Column(name="RIDE_ID")
	@SequenceGenerator(name="RIDE_ID_GEN", sequenceName="RIDE_SEQ", allocationSize=1)
	@GeneratedValue(generator="RIDE_ID_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable=false)
	LocalDateTime startTime;
	
	LocalDateTime endTime;
	
	@ManyToOne(cascade=CascadeType.REMOVE, fetch=FetchType.EAGER)
	@JoinColumn(name="RIDER_ID", nullable=false)
	Rider rider;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CAR_ID", nullable=false)
	Car car;
	
	@ManyToOne(cascade=CascadeType.REMOVE, fetch=FetchType.EAGER)
	@JoinColumn(name="ROUTE_ID", nullable=false)
	Route route;

	public Ride() {}

	public Ride(LocalDateTime startTime, LocalDateTime endTime, Rider rider, Car car, Route route) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.rider = rider;
		this.car = car;
		this.route = route;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Rider getRider() {
		return rider;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
}
