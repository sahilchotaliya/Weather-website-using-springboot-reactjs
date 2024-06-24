package com.example.weatherapp.service;

import com.example.weatherapp.model.Weather;
import com.example.weatherapp.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    public Weather getWeatherByCity(String city) {
        return weatherRepository.findById(city)
                .orElseGet(() -> {
                    Weather weather = generateRandomWeather(city);
                    return weatherRepository.save(weather);
                });
    }

    private Weather generateRandomWeather(String city) {
        Random random = new Random();
        double temperature = 10 + (30 - 10) * random.nextDouble();
        String[] descriptions = {"Sunny", "Partly cloudy", "Cloudy", "Rainy", "Stormy"};
        String description = descriptions[random.nextInt(descriptions.length)];
        int humidity = random.nextInt(101);

        return new Weather(city, temperature, description, humidity);
    }
}