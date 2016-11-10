package com.ppro.persistence;

import com.ppro.model.Ticket;
import com.ppro.model.Ticket;

import java.util.Date;
import java.util.List;

/**
 * Created by Arci on 10.11.2016.
 */
public interface TicketService {
    List<Ticket> findAll();

    void saveTicket(Ticket Ticket);

    Ticket findOne(Integer id);

    void delete(Integer id);
    
    List<Ticket> findByAirplaneid(int id);
    List<Ticket> findByDate(Date date);
    List<Ticket> findByPersonid(int id);
}
