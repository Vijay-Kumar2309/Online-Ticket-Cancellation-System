package com.example.ticket.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.ticket.model.Ticket;
import com.example.ticket.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    // Book Ticket
    @PostMapping
    public Ticket bookTicket(@RequestBody Ticket ticket) {
        return service.bookTicket(ticket);
    }

    // Cancel Ticket
    @DeleteMapping("/{id}")
    public String cancelTicket(@PathVariable String id) {
        return service.cancelTicket(id);
    }

    // Get All Tickets
    @GetMapping
    public List<Ticket> getTickets() {
        return service.getAllTickets();
    }
}