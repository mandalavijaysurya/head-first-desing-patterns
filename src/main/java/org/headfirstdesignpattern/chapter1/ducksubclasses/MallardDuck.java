package org.headfirstdesignpattern.chapter1.ducksubclasses;

import org.headfirstdesignpattern.chapter1.Duck;

public class MallardDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Mallard Duck quacking...");
    }

    @Override
    public void swim() {
        System.out.println("Mallard Duck is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck is flying");
    }

}
