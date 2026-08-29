package com.seatly.dto.user;

public class UserCreateRequest {

    private String email;
    private String nickname;

    protected UserCreateRequest() {
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }
}