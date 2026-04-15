package com.example.ticket.service;

import org.springframework.stereotype.Service;
import java.util.*;

import com.example.ticket.model.Ticket;

@Service
public class TicketService {

    private List<Ticket> tickets = new ArrayList<>();

    // Book Ticket
    public Ticket bookTicket(Ticket ticket) {
        ticket.setStatus("BOOKED");
        tickets.add(ticket);
        return ticket;
    }

    // Cancel Ticket
    public String cancelTicket(String ticketId) {
        for (Ticket t : tickets) {
            if (t.getTicketId().equals(ticketId)) {
                t.setStatus("CANCELLED");
                return "Ticket Cancelled Successfully";
            }
        }
        return "Ticket Not Found";
    }

    // Get All Tickets
    public List<Ticket> getAllTickets() {
        return tickets;
    }
}