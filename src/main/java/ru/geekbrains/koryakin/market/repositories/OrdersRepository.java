package ru.geekbrains.koryakin.market.repositories;

import ru.geekbrains.koryakin.market.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Order, Long> {
}
