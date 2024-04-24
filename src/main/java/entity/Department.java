package entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Departments")
public class Department implements Serializable{

	@Id
	@Column(name = "departmentId", nullable = false, columnDefinition = "varchar(255)")
	private String id;
	
	@Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
	private String name;
	
	
//	private Set<String>contactNumbers;

	@Embedded
	private Address address;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	public Department(String id, String name ) {
		super();
		this.id = id;
		this.name = name;
		
	}


	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
