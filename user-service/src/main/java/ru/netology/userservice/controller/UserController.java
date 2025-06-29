package ru.netology.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.User;
import ru.netology.userservice.service.UserService;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("{userId}")
    public ResponseEntity<User> getUsers(@PathVariable int userId) {
        return ResponseEntity.ok().body(userService.getUserById(userId));
    }
}
