package com.seatly.seatly.controller;

import com.seatly.seatly.domain.User;
import com.seatly.seatly.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(
            @RequestParam String email,
            @RequestParam String nickname
    ) {
        return userService.createUser(email, nickname);
    }
}