package entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DepartmentEmployees")
public class DepartmentEmployee {
	@Id
	@Column(name = "fromDate", columnDefinition = "datetime2(7)")
	private Date fromDate;
	
	@Column(name = "toDate", columnDefinition = "datetime2(7)")
	private Date toDate;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "employeeId", name = "employeeId")
	private Employee employeeID;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "departmentId", name = "departmentId")
	private Department departmentID;

	public DepartmentEmployee(Date fromDate, Date toDate, Employee employeeID, Department departmentID) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.employeeID = employeeID;
		this.departmentID = departmentID;
	}

	public DepartmentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Employee getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Employee employeeID) {
		this.employeeID = employeeID;
	}

	public Department getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Department departmentID) {
		this.departmentID = departmentID;
	}
	
	
	
	
	
}
