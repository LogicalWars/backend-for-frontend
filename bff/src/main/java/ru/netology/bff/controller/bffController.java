package ru.netology.bff.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.UserOrders;
import ru.netology.bff.service.bffService;

@RestController
@RequestMapping("/api/site-bff/")
@RequiredArgsConstructor
public class bffController {
    private final bffService service;

    @GetMapping("user/{userId}")
    public ResponseEntity<UserOrders> getUserOrders(@PathVariable int userId) {
        return ResponseEntity.ok().body(service.getUserOrdersByUserId(userId));
    }
}
