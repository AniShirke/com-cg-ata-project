package com.cg.ata.project.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking_table")
public class Booking 
{  
    @Id
    private String bookingID;
    @Column
    private String destination;
    @Column
    private String source;
    @Column
    private String boardingPoint;
    @Column
    private String dropPoint;
    @Column
    private int noOfPassengers ;
    @Column
    private LocalDate journeyDate;
	public String getBookingID() {
		return bookingID;
	}
	
	
	
	
	public Booking(String bookingID, String destination, String source, String boardingPoint, String dropPoint,
			int noOfPassengers, LocalDate journeyDate) {
		super();
		this.bookingID = bookingID;
		this.destination = destination;
		this.source = source;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
		this.noOfPassengers = noOfPassengers;
		this.journeyDate = journeyDate;
	}




	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getBoardingPoint() {
		return boardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	public String getDropPoint() {
		return dropPoint;
	}
	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "Book [bookingID=" + bookingID + ", destination=" + destination + ", source=" + source
				+ ", boardingPoint=" + boardingPoint + ", dropPoint=" + dropPoint + ", noOfPassengers=" + noOfPassengers
				+ ", journeyDate=" + journeyDate + "]";
	}
   
    
    
    
    
    
}


    