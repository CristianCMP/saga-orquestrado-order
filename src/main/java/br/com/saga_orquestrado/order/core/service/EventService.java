package br.com.saga_orquestrado.order.core.service;

import br.com.saga_orquestrado.order.core.document.Event;
import br.com.saga_orquestrado.order.core.repository.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventService {

    private final EventRepository repository;

    public Event save(Event event) {
        return repository.save(event);
    }
}
