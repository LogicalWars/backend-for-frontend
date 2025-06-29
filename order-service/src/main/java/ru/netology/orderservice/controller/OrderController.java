package ru.netology.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.Order;
import ru.netology.orderservice.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders/")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("by-user/{user}")
    public ResponseEntity<List<Order>> getByUser(@PathVariable("user") int user) {
        return ResponseEntity.ok().body(orderService.getOrderByUserId(user));
    }
}
