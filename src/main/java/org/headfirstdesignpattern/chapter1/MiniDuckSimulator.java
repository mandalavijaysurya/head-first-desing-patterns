package org.headfirstdesignpattern.chapter1;

import org.headfirstdesignpattern.chapter1.behaviours.fly.FlyingWithRockets;
import org.headfirstdesignpattern.chapter1.ducksubclasses.MallardDuck;
import org.headfirstdesignpattern.chapter1.ducksubclasses.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
       Duck duck = new MallardDuck();
       duck.performFly();
       duck.performQuack();
       duck.performSwim();

       Duck duck2 = new ModelDuck();
       duck2.performFly();
       System.out.println("========= Changing behaviour =========");
       duck2.setFlyBehaviour(new FlyingWithRockets());
       duck2.performFly();


    }
}
