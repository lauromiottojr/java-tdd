package com.tdd;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tdd.model.BookingModel;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookingControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	LocalDate checkIn = LocalDate.parse("2022-11-20");
	LocalDate checkOut = LocalDate.parse("2022-11-30");

	BookingModel bookingModel = new BookingModel(1, "Lauro", checkIn, checkOut, 2);

	@Test
	public void bookingTestGetAll() throws Exception {
		mockMvc.perform(get("/bookings")).andExpect(status().isOk());
	}

	@Test
	public void bookingTestSave() throws Exception {
		mockMvc.perform(post("/bookings").contentType("application/json")
				.content(objectMapper.writeValueAsString(bookingModel))).andExpect(status().isOk());
	}

	@Test
	public void bookingTestDelete() throws Exception {
		mockMvc.perform(delete("/bookings")).andExpect(status().isOk());
	}
	
	@Test
	public void bookingTestPut() throws Exception {
		mockMvc.perform(delete("/bookings")).andExpect(status().isOk());
	}

}
