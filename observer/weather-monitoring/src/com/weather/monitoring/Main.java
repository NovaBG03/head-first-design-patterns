package com.weather.monitoring;

import com.weather.monitoring.display.*;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement weatherStatisticsDisplay = new StatisticsDisplay(weatherData);
        DisplayElement simpleForecastDisplay = new ForecastDisplay(weatherData);
        DisplayElement heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(25, 70, 29.2f);
        weatherData.setMeasurements(35, 90, 29.2f);
    }
}
