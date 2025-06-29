package ru.netology.orderservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.Order;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class OrderRepository {
    private final ConcurrentHashMap<Integer, Order> orders = new ConcurrentHashMap<>();

    private OrderRepository() {
        orders.put(201, new Order(201,
                101,
                1000,
                "RUR",
                List.of("Apple", "Banana", "Milk"))
        );
        orders.put(202, new Order(202,
                101,
                2000,
                "RUR",
                List.of("Bread"))
        );
    }

    public List<Order> getOrderByUserId(int id) {
        return orders.values().stream()
                .filter(order -> order.getUserId() == id)
                .toList();
    }
}
