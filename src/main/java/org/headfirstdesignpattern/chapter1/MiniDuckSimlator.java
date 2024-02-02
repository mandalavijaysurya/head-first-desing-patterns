package org.headfirstdesignpattern.chapter1;

import org.headfirstdesignpattern.chapter1.ducksubclasses.MallardDuck;

public class MiniDuckSimlator {
    public static void main(String[] args) {
       Duck duck = new MallardDuck();
       duck.performFly();
       duck.performQuack();
       duck.performSwim();


    }
}
