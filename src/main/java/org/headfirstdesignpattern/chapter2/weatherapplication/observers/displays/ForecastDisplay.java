package org.headfirstdesignpattern.chapter2.weatherapplication.observers.displays;

import org.headfirstdesignpattern.chapter2.weatherapplication.observers.Observer;

public class ForecastDisplay implements DisplayElement, Observer {
    @Override
    public void update(float temperature, float humidity, float pressure)  {

    }

    @Override
    public void display() {

    }
}
