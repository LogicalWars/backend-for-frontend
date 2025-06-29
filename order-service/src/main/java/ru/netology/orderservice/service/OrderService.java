package ru.netology.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.Order;
import ru.netology.orderservice.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getOrderByUserId(int id) {
        return orderRepository.getOrderByUserId(id);
    }
}
