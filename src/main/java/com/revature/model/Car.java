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
public class Car {
	
	@Id
	@Column(name="CAR_ID")
	@SequenceGenerator(name="CAR_ID_GEN", sequenceName="CAR_SEQ", allocationSize=1)
	@GeneratedValue(generator="CAR_ID_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable=false)
	private String status;
	
	@Column(nullable=false)
	private String make;
	
	@Column(nullable=false)
	private String model;
	
	@Column(nullable=false)
	private int maxCapacity;
	
	@Column(nullable=false)
	private int seatsLeft;
	
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="ADDRESS_ID", nullable=false)
	private Address location;

	public Car() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getSeatsLeft() {
		return seatsLeft;
	}

	public void setSeatsLeft(int seatsLeft) {
		if (seatsLeft > 0 && seatsLeft <= this.maxCapacity)
			this.seatsLeft = seatsLeft;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}
}
