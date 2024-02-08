package org.headfirstdesignpattern.chapter2.weatherapplication;

import org.headfirstdesignpattern.chapter2.weatherapplication.observers.displays.CurrentConditionDisplay;
import org.headfirstdesignpattern.chapter2.weatherapplication.observers.displays.StatisticsDisplay;
import org.headfirstdesignpattern.chapter2.weatherapplication.subjects.WeatherData;

public class WeatherAppSimulator {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(55,65,30.4f);
        weatherData.setMeasurements(92,65,30.4f);
    }
}
