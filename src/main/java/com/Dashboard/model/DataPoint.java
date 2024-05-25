package com.Dashboard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "data_points")
public class DataPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int intensity;
    private int likelihood;
    private int relevance;
    private int year;
    private String country;
    private String topic;
    private String region;
    private String city;

    // Getters and Setters
}


