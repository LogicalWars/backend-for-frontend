package ru.netology.userservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.User;

import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private final ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<>();

    private UserRepository() {
        users.put(101, new User(101,
                "Ivan",
                "Ivanov",
                "Ivanovich",
                "Moscow",
                "+7(927)5555555",
                "ivan@mail.com"));
    }

    public User getById(int id) {
        return users.get(id);
    }
}
