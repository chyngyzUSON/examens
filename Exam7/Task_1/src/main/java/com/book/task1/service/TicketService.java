package com.book.task1.service;

import com.book.task1.entity.Ticket;

public interface TicketService {
    Ticket save(Ticket ticket);
    Ticket findById(Long id);
    Ticket deleteTicketById(Long id);
}
