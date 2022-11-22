package com.tdd;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.tdd.service.BookingService;

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

	@Test
	public void bookingTestServiceDaysCalculator() {
		String name = "Lauro";
		Integer days = bookingService.daysCalculatorWithDB(name);

		Assertions.assertEquals(days, 10);
	}

}
