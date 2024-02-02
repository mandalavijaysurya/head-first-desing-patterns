package org.headfirstdesignpattern.chapter1.behaviours.quack;

public class Mute implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Hey I can't quack, rather I stay silent");
    }
}
