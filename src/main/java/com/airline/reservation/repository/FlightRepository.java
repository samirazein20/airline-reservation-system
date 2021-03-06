package com.airline.reservation.repository;

import com.airline.reservation.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    public Flight findByFlightNumber(Integer flightNumber);
    public List<Flight> findByDepartureDate(LocalDate departureDate);

}
