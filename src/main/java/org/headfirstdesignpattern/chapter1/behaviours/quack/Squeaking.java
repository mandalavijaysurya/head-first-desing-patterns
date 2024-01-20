package org.headfirstdesignpattern.chapter1.behaviours.quack;

public class Squeaking implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Hey I can just squeak rather than quack");
    }
}
