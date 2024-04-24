package entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Phones")
public class Phone implements Serializable{
	
	@Id
	@Column(name = "phone", nullable = false, columnDefinition = "varchar(255)")
	private String phone;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departmentId", referencedColumnName = "departmentId")
	private Department department;

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String phone, Department department) {
		super();
		this.phone = phone;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Phone [phone=" + phone + ", department=" + department + "]";
	}
	
	
	
	
}
