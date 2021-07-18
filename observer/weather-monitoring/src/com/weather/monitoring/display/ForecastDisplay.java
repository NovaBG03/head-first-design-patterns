package com.weather.monitoring.display;

import com.weather.monitoring.Observer;
import com.weather.monitoring.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.lastPressure = this.currentPressure;
        this.currentPressure = weatherData.getPressure();
        this.display();
    }

    @Override
    public void display() {
        String message = getForecastMessage();

        System.out.println("Forecast: " + message);
    }

    private String getForecastMessage() {
        if (currentPressure > lastPressure) {
            return "Improving weather on the way!";
        }

        if (currentPressure < lastPressure) {
            return "Watch out for cooler, rainy weather";
        }

        return "More of the same";
    }
}
