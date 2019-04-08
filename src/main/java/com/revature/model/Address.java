package com.revature.model;

public class Address {
	private String type;
	private String line1;
	private String line2;
	private String city;
	private String zipcode;
	private String country;
	
	public Address() {}

	public Address(String type, String line1, String line2, String city, String zipcode, String country) {
		super();
		this.type = type;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
