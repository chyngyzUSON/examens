package com.book.task1.service;

import com.book.task1.entity.Ticket;
import com.book.task1.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepo ticketRepo;

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepo.save(ticket);
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepo.findById(id).orElse(null);
    }

    @Override
    public Ticket deleteTicketById(Long id) {
        Ticket ticket = findById(id);
        if (ticket != null){
            ticketRepo.delete(ticket);
            return ticket;
        }
        return null;
    }
}
