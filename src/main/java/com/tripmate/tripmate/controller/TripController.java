package com.tripmate.tripmate.controller;

import com.tripmate.tripmate.model.Trip;
import com.tripmate.tripmate.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trips")
public class TripController {
    @Autowired
    private TripRepository tripRepository;

    @PostMapping
    public Trip createTrip(@RequestBody Trip trip) {
        return tripRepository.save(trip);
    }

    @GetMapping
    public List<Trip> getTrips() {
        return tripRepository.findAll();
    }
}
