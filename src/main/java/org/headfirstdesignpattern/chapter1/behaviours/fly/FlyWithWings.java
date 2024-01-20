package org.headfirstdesignpattern.chapter1.behaviours.fly;

public class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I have wings and I will fly with those");
    }
}
