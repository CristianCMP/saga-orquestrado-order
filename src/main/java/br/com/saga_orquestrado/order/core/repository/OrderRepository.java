package br.com.saga_orquestrado.order.core.repository;

import br.com.saga_orquestrado.order.core.document.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
