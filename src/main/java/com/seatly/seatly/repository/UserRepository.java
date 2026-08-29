package com.seatly.seatly.repository;

import com.seatly.seatly.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}