package ru.netology.bff.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.netology.Order;
import ru.netology.User;
import ru.netology.UserOrders;

import java.util.List;

@Service
@RequiredArgsConstructor
public class bffService {

    private final RestTemplate restTemplate;

    @Value("${service.user-service}")
    private String urlUserService;

    @Value("${service.order-service}")
    private String urlOrderService;

    public User getUserById(int id) {
        ResponseEntity<User> response = restTemplate.exchange(
                urlUserService + id,
                HttpMethod.GET,
                null,
                User.class);
        return response.getBody();
    }

    public List<Order> getOrdersByUserId(int id) {
        ResponseEntity<List<Order>> response = restTemplate.exchange(
                urlOrderService + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Order>>() {
                }
        );
        return response.getBody();
    }

    public UserOrders getUserOrdersByUserId(int id) {
        return new UserOrders(
                getUserById(id),
                getOrdersByUserId(id)
        );
    }
}
