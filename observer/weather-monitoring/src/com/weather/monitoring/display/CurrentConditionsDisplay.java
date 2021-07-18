package com.weather.monitoring.display;

import com.weather.monitoring.Observer;
import com.weather.monitoring.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.display();
    }

    public void display() {
        System.out.println("Current conditions: " +
                this.temperature + "°C and " +
                this.humidity + "% humidity");
    }
}
