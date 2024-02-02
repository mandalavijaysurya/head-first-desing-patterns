package org.headfirstdesignpattern.chapter1.behaviours.swim;

public class NoSwim implements SwimBehaviour{
    @Override
    public void swim() {
        System.out.println("I can't swim, I'm drowning");
    }
}
