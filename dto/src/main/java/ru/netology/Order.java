package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private int id;
    private int userId;
    private int totalAmount;
    private String currency;
    private List<String> items;
}
