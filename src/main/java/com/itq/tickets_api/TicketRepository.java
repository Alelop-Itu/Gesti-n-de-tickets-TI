package com.itq.tickets_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Esto servirá para la opción "Mis Tickets" del usuario
    List<Ticket> findByUsuarioId(Long usuarioId);
}