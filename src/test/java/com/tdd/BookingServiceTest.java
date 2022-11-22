package com.tdd;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.tdd.model.BookingModel;
import com.tdd.service.BookingService;

import repository.BookingRepository;

@RunWith(SpringRunner.class)
public class BookingServiceTest {

	@TestConfiguration
	static class BookingServiceTestConfig {

		@Bean
		public BookingService bookingService() {
			return new BookingService();
		}

	}

	@Autowired
	private BookingService bookingService;

	@MockBean
	private BookingRepository bookingRepository;

	@Test
	public void bookingTestServiceDaysCalculator() {
		String name = "Lauro";
		Integer days = bookingService.daysCalculatorWithDB(name);

		Assertions.assertEquals(days, 10); // o valor deve ser a diferença entre o checkIn e checkOut
	}

	@Before
	public void setup() {
		LocalDate checkIn = LocalDate.parse("2022-11-20");
		LocalDate checkOut = LocalDate.parse("2022-11-30");

		BookingModel bookingModel = new BookingModel(1, "Lauro", checkIn, checkOut, 2);

		Mockito.when(bookingRepository.findByReverveName(bookingModel.getReserveName()))
				.thenReturn(java.util.Optional.of(bookingModel));
	}

}
