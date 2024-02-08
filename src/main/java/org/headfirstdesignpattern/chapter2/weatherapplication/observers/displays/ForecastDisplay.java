package org.headfirstdesignpattern.chapter2.weatherapplication.observers.displays;

import org.headfirstdesignpattern.chapter2.weatherapplication.observers.Observer;
import org.headfirstdesignpattern.chapter2.weatherapplication.subjects.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer {

    private WeatherData weatherData;
    private float currentPressure = 29.2f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update()  {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current and Previous pressures are: " +currentPressure + ", " + lastPressure);
    }
}
