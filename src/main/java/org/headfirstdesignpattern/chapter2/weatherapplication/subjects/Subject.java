package org.headfirstdesignpattern.chapter2.weatherapplication.subjects;

import org.headfirstdesignpattern.chapter2.weatherapplication.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void deRegisterObserver(Observer o);
    void notifyObserver();
}
