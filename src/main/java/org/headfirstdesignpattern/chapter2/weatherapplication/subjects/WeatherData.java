package org.headfirstdesignpattern.chapter2.weatherapplication.subjects;

import org.headfirstdesignpattern.chapter2.weatherapplication.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void deRegisterObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerList){
            observer.update(temperature, humidity, pressure);
        }

    }

    private void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
