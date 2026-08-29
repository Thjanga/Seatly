package com.seatly.service;

import com.seatly.domain.User;
import com.seatly.dto.user.UserCreateRequest;
import com.seatly.dto.user.UserResponse;
import com.seatly.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(UserCreateRequest request) {

        User user = new User(
                request.getEmail(),
                request.getNickname()
        );

        User savedUser = userRepository.save(user);

        return new UserResponse(savedUser);
    }
}