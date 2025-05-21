package com.tripmate.tripmate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String destination;
    private String description;
    public Trip() {}
    public Trip(String title, String destination, String description) {
        this.title = title;
        this.destination = destination;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getEnd() {
        return destination;
    }
    public String getDescription() {
        return description;
    }

    public void setEnd(String end) {
        this.destination = destination;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
