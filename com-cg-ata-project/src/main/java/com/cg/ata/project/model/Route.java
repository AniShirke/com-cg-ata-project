package com.cg.ata.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Route_table")
public class Route
{
	@Id
	private String routeID;
	@Column
	private String source;
	@Column
	private String destination;
	@Column
	private int distance;
	@Column
	private int duration;
	
	
	
	
	public Route(String routeID, String source, String destination, int distance, int duration) {
		super();
		this.routeID = routeID;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.duration = duration;
	}
	public String getRouteID() {
		return routeID;
	}
	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Route [routeID=" + routeID + ", source=" + source + ", destination=" + destination + ", distance="
				+ distance + ", Duration=" + duration + "]";
	}
   

}
