package com.infortech.book.ticket.app;
 

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infortech.book.ticket.app.entities.Ticket;
import com.infortech.book.ticket.app.service.ticketBookingService;

@SpringBootApplication
public class TicketBookingManagmentAppApplication   {

	 
	public static void main(String[] args) {

		SpringApplication.run(TicketBookingManagmentAppApplication.class, args); 

	}
	
 

}
