package com.cg.ata.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="driver_table")
public class Driver
{  
	@Id
	private String driverID;
	@Column
	private String dname;
	@Column
	private String address;
	@Column
	private int contactNumber;
	public String getDriverID() {
		return driverID;
	}
	
	public Driver(String driverID, String dname, String address, int contactNumber) {
		super();
		this.driverID = driverID;
		this.dname = dname;
		this.address = address;
		this.contactNumber = contactNumber;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}
