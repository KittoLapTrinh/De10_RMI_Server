package entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name=  "Employees")
public class Employee implements Serializable{
	
	@Id
	@Column(name = "employeeId", nullable = false, columnDefinition = "varchar(255)")
	private String id;
	
	private Date dateOfBirth;
	private String firstName;
	private Gender gender;
	private String lastName;
	private String email;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String id, Date dateOfBirth, String firstName, Gender gender, String lastName) {
		super();
		this.id = id;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", dateOfBirth=" + dateOfBirth + ", firstName=" + firstName + ", gender=" + gender
				+ ", lastName=" + lastName + "]";
	}
	
	
}
