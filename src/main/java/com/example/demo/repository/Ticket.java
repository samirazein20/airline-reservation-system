package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Ticket extends JpaRepository<Ticket, Long> {
}