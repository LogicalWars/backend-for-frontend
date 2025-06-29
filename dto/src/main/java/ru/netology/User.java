package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
}
