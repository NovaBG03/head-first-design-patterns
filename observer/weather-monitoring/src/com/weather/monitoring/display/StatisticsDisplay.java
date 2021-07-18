package com.weather.monitoring.display;

import com.weather.monitoring.Observer;
import com.weather.monitoring.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;

    private List<Float> temperatures;

    public StatisticsDisplay(WeatherData weatherData) {
        this.temperatures = new ArrayList<>();
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float currentTemperature = this.weatherData.getTemperature();
        this.temperatures.add(currentTemperature);
        this.display();
    }

    @Override
    public void display() {
        float averageTemperature = getAverageTemperature();
        float maxTemperature = getMaxTemperature();
        float minTemperature = getMinTemperature();

        System.out.println("Avg/Max/Min temperature = " +
                averageTemperature + "/" +
                maxTemperature + "/" +
                minTemperature);
    }

    private float getMinTemperature() {
        return this.temperatures.stream()
                .min(Float::compare)
                .orElse(0f);
    }

    private float getMaxTemperature() {
        return this.temperatures.stream()
                .max(Float::compare)
                .orElse(0f);
    }

    private float getAverageTemperature() {
        float sum = 0;
        for (float temperature : this.temperatures) {
            sum += temperature;
        }
        float average = sum / this.temperatures.stream().count();
        return average;
    }
}
