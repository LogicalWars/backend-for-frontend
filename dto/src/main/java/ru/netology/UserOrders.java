package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserOrders {
    private User user;
    private List<Order> orders;
}
