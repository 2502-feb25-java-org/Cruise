package com.revature.model;

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
public class Garage {
	
	@Id
	@Column(name="GARAGE_ID")
	@SequenceGenerator(name="GARAGE_ID_GEN", sequenceName="GARAGE_SEQ", allocationSize=1)
	@GeneratedValue(generator="GARAGE_ID_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ADDRESS_ID", nullable=false)
	private Address location;
	
	@Column(nullable=false)
	private int maxCapacity;
	
	@Column(nullable=false)
	private int spacesLeft;

	public Garage() {}

	public Garage(Address location, int maxCapacity) {
		this.location = location;
		this.maxCapacity = maxCapacity;
		this.spacesLeft = maxCapacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getSpacesLeft() {
		return spacesLeft;
	}

	public void setSpacesLeft(int spacesLeft) {
		if (spacesLeft > 0 && spacesLeft <= this.maxCapacity)
			this.spacesLeft = spacesLeft;
	}
}
