package org.headfirstdesignpattern.chapter1.ducksubclasses;

import org.headfirstdesignpattern.chapter1.Duck;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Hey! I can't quack but can press me. I can make sound");
    }

    @Override
    public void swim() {
        System.out.println("I dont swim, I just float :)");
    }

    @Override
    public void fly() {
        System.out.println("Sorry!.. I can fly rather you can hold me in air");
    }

    @Override
    public void display() {
        System.out.println("This is a " +this.getClass().getSimpleName());
    }
}
