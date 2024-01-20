package org.headfirstdesignpattern.chapter1.behaviours.fly;

public class NoFly implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I have no wings, I cannot fly");
    }
}
