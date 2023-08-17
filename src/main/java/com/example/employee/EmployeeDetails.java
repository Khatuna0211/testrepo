package com.example.employee;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;
@javax.persistence.Entity
@Table(appliesTo = "")
public class EmployeeDetails {
 @Id
private long id;
	private String name;
	private String Address;
	private String Department;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "Entity1 [id=" + id + ", name=" + name + ", Address=" + Address + ", Department=" + Department + "]";
	}
	public EmployeeDetails(long id, String name, String address, String department) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		Department = department;
	}
	
	

}