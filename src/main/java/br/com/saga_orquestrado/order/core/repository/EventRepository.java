package br.com.saga_orquestrado.order.core.repository;

import br.com.saga_orquestrado.order.core.document.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
}
