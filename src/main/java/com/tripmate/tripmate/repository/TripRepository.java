package com.tripmate.tripmate.repository;

import com.tripmate.tripmate.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByDestination(String destination);
    List<Trip> findByTitle(String title);
    List<Trip> findByDescription(String description);
}
