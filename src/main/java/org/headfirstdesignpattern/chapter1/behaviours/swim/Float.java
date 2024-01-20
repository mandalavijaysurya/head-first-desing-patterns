package org.headfirstdesignpattern.chapter1.behaviours.swim;

public class Float implements SwimBehaviour{
    @Override
    public void swim() {
        System.out.println("I meant to float");
    }
}
