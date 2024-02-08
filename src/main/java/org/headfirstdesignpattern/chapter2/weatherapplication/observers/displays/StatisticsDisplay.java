package org.headfirstdesignpattern.chapter2.weatherapplication.observers.displays;

import org.headfirstdesignpattern.chapter2.weatherapplication.observers.Observer;
import org.headfirstdesignpattern.chapter2.weatherapplication.subjects.WeatherData;


public class StatisticsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float maxTemperature;
    private float avgTemperature;
    private float minTemperature;
    private int temperatureCount;
    private float temperatureSum;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(){
        this.temperature = weatherData.getTemperature();
        maxTemperature = Math.max(temperature, maxTemperature);
        minTemperature = Math.min(temperature, minTemperature);
        temperatureSum += temperature;
        avgTemperature = temperatureSum / ++temperatureCount;
        display();

    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature: "+avgTemperature+"/"+maxTemperature+"/"+minTemperature);
    }
}
