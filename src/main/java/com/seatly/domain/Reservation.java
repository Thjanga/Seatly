package com.seatly.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "facility_id")
    private Facility facility;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    protected Reservation() {
    }

    public Reservation(
            User user,
            Facility facility,
            LocalDateTime startTime,
            LocalDateTime endTime
    ) {
        this.user = user;
        this.facility = facility;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Facility getFacility() {
        return facility;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}