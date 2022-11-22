package com.tdd.model;

import java.time.LocalDate;

public class BookingModel {

	private Integer id;
	private String reserveName;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private Integer numberGuests;

	public BookingModel(Integer id, String reserveName, LocalDate checkIn, LocalDate checkOut, Integer numberGuests) {
		super();
		this.id = id;
		this.reserveName = reserveName;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numberGuests = numberGuests;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReserveName() {
		return reserveName;
	}

	public void setReserveName(String reserveName) {
		this.reserveName = reserveName;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getNumberGuests() {
		return numberGuests;
	}

	public void setNumberGuests(Integer numberGuests) {
		this.numberGuests = numberGuests;
	}

}
