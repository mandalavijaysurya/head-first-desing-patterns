package org.headfirstdesignpattern.chapter2.weatherapplication.observers;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
