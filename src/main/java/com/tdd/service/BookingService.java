package com.tdd.service;

import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdd.model.BookingModel;

import repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	public Integer daysCalculatorWithDB(String name) {
		Optional<BookingModel> bookingModelOpt = bookingRepository.findByReverveName(name);
		return Period.between(bookingModelOpt.get().getCheckIn(), bookingModelOpt.get().getCheckOut()).getDays();
	}

}
