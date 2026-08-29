package com.seatly.dto.user;

import com.seatly.domain.User;

public class UserResponse {

    private final Long id;
    private final String email;
    private final String nickname;

    public UserResponse(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.nickname = user.getNickname();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }
}