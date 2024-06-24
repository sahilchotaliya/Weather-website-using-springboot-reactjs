package com.example.weatherapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Weather {
    @Id
    private String city;
    private double temperature;
    private String description;
    private int humidity;

    // Default constructor
    public Weather() {}

    // Constructor with parameters
    public Weather(String city, double temperature, String description, int humidity) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
        this.humidity = humidity;
    }

    // Getters and setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}