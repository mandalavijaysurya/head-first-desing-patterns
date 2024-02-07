package org.headfirstdesignpattern.chapter2.weatherapplication.subjects;

public interface Subject {
    void registerObserver();
    void deRegisterObserver();
    void notifyObserver();
}
