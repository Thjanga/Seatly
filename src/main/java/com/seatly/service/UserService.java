package com.seatly.service;

import com.seatly.domain.User;
import com.seatly.dto.user.UserCreateRequest;
import com.seatly.dto.user.UserResponse;
import com.seatly.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public UserResponse getUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        return new UserResponse(user);
    }

    public List<UserResponse> getUsers(){
        return userRepository.findAll()
                .stream()
                .map(UserResponse::new)
                .toList();
    }
}