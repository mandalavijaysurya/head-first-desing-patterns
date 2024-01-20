package org.headfirstdesignpattern.chapter1.behaviours.quack;

public class Quacking implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can quack! Quack! Quack!!");
    }
}
