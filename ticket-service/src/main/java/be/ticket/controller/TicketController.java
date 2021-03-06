package be.ticket.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import be.ticket.dao.TicketDAO;
import be.ticket.domain.Ticket;

@RestController
public class TicketController {

	@Autowired
	TicketDAO ticketDAO;

	/*
	 * private final List<Ticket> tickets = Arrays.asList( new Ticket(1, 1,
	 * "Product A", "Oil", "blabla", null, 0), new Ticket(2, 1, "Product B", "Tire",
	 * "blabla", null, 0), new Ticket(3, 2, "Product C", "Motor", "blabla", null,
	 * 0), new Ticket(4, 1, "Product D", "Outlet", "blabla", null, 0), new Ticket(5,
	 * 2, "Product E", "Tire", "blabla", null, 0), new Ticket(6, 3, "Product F",
	 * "Tire", "blabla", null, 0));
	 */

	// int id, int accountId, String title, String category, String text, LocalDate
	// publishDate, int userId

	
	@GetMapping
	public List<Ticket> getAllTickets(@RequestParam(required = false) Integer accountId) {

		System.err.println("**********getAllTickets***************");
		List<Ticket> allTickets = ticketDAO.findAll();

		if (accountId != null) {
			return allTickets.stream().filter(ticket -> accountId.equals(ticket.getAccountId()))
					.collect(Collectors.toList());
		}
		return allTickets;
	}

	@GetMapping("/{id}")
	public Optional<Ticket> getTicketsForAccount(@RequestParam(required = false) Integer accountId) {

		

		System.err.println("**********getTicketByaccountId***************");

		return ticketDAO.findByAccountId(accountId);
	}

	@PostMapping(value = "/addTicket")
	public ResponseEntity<Ticket> ajouterCommande(@RequestBody Ticket ticket) {

		System.err.println("**************/addTicket backend**************");

		ticket.setPublishDate(LocalDateTime.now());

		System.err.println(ticket.getTitle());
		System.err.println(ticket.getAccountId());

		return new ResponseEntity<Ticket>(ticketDAO.save(ticket), HttpStatus.CREATED);
	}

}
