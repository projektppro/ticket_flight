package com.ppro.persistence;

import com.ppro.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Arci on 10.11.2016.
 */
@Service("ticketService")
public class TicketServiceImpl implements TicketService {


    @Qualifier("ticketRepository")
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAll() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    @Override
    public void saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public Ticket findOne(Integer id) {
        return ticketRepository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        ticketRepository.delete(id);
    }

    @Override
    public List<Ticket> findByAirplaneid(int id) {
        return (List<Ticket>) ticketRepository.findByAirplaneid(id);
    }

    @Override
    public List<Ticket> findByDate(Date date) {
        return (List<Ticket>) ticketRepository.findByDate(date);
    }

    @Override
    public List<Ticket> findByPersonid(int id) {
        return (List<Ticket>) ticketRepository.findByPersonid(id);
    }
}
