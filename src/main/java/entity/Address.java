package entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Embeddable
public class Address {
	private String city;
	private String postalCode;
	private String state;
	private String street;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String postalCode, String state, String street) {
		super();
		this.city = city;
		this.postalCode = postalCode;
		this.state = state;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", postalCode=" + postalCode + ", state=" + state + ", street=" + street + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
}
