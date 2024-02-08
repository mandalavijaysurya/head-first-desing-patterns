package org.headfirstdesignpattern.chapter2.weatherapplication.observers.displays;

import org.headfirstdesignpattern.chapter2.weatherapplication.observers.Observer;
import org.headfirstdesignpattern.chapter2.weatherapplication.subjects.WeatherData;

public class CurrentConditionDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private WeatherData  weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature +" F degrees and " + humidity +" humidity");
    }

    @Override
    public void update(){
        this.humidity = weatherData.getHumidity();
        this.temperature = weatherData.getTemperature();
        display();
    }
}
