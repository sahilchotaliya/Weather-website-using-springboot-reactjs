package com.example.weatherapp.controller;

import com.example.weatherapp.model.Weather;
import com.example.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "http://localhost:3000")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public Weather getWeatherByCity(@PathVariable String city) {
        return weatherService.getWeatherByCity(city);
    }
}