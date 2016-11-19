package com.ppro.persistence;

import com.ppro.model.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by Arci on 10.11.2016.
 */
public interface TicketRepository extends CrudRepository<Ticket,Integer> {
    Iterable<Ticket> findByAirplaneid(int id);
    Iterable<Ticket> findByDate(Date date);
    Iterable<Ticket> findByPersonid(int id);

}
