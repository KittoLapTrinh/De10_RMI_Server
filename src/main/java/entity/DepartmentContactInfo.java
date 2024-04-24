package entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class DepartmentContactInfo {
	private String city;

	 private String postalCode;
	 private String state;

	 private String street;

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

	public DepartmentContactInfo(String city, String postalCode, String state, String street) {
		super();
		this.city = city;
		this.postalCode = postalCode;
		this.state = state;
		this.street = street;
	}

	public DepartmentContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DepartmentContactInfo [city=" + city + ", postalCode=" + postalCode + ", state=" + state + ", street="
				+ street + "]";
	}
	 
	 

}
