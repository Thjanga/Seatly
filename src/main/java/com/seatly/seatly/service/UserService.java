package com.seatly.seatly.service;

import com.seatly.seatly.domain.User;
import com.seatly.seatly.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String email, String nickname) {
        User user = new User(email, nickname);

        return userRepository.save(user);
    }
}