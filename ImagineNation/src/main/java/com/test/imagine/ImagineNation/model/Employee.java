package com.test.imagine.ImagineNation.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="emp_id")
	private Integer employeeId;
  
	@Column(name="emp_firstName")
	private String firstName;
	
	@Column(name="emp_lastName")
	private String lastName;
	
	@Column(name="emp_email")
	private String empEmail;
	
	@Column(name="emp_dateOfJoin")
	private Date dateOfJoining;
	
	@Column(name="emp_salary")
	private Double  empSalary;
	
	@OneToMany(fetch = FetchType.LAZY,  mappedBy = "emp",cascade = CascadeType.ALL)
    private Set<Phone> phoneList =new HashSet<Phone>();

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpFirstName() {
		return firstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.firstName = empFirstName;
	}

	public String getEmpLastName() {
		return lastName;
	}

	public void setEmpLastName(String empLastName) {
		this.lastName = empLastName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Date getEmpDateOfJoin() {
		return dateOfJoining;
	}

	public void setEmpDateOfJoin(Date empDateOfJoin) {
		this.dateOfJoining = empDateOfJoin;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public Set<Phone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(Set<Phone> phoneList) {
		this.phoneList = phoneList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
