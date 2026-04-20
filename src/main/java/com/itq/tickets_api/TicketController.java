package com.itq.tickets_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "http://localhost:4200") // Conexión con tu Angular
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping
    public List<Ticket> listarTodos() {
        return ticketRepository.findAll();
    }

    @PostMapping
    public Ticket guardar(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ticketRepository.deleteById(id);
    }
}