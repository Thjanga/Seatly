package com.seatly.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // 테이블명을 'users'로 강제 지정
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String nickname;

    protected User() {
    }

    public User(String email, String nickname) {
        this.email = email;
        this.nickname = nickname;
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