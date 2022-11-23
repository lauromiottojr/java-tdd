package com.tdd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdd.model.BookingModel;

@Controller
@RestController
@RequestMapping("/bookings")
public class BookingController {

	@GetMapping
	@ResponseBody
	public String getAll() {
		return "OK";
	}

	@PostMapping
	public ResponseEntity<BookingModel> save(BookingModel bookingModel) {
		return ResponseEntity.status(HttpStatus.OK).body(bookingModel);
	}

	@DeleteMapping
	public void delete() {

	}

	@PutMapping
	public void put() {

	}
}
