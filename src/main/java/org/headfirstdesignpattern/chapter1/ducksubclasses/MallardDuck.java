package org.headfirstdesignpattern.chapter1.ducksubclasses;


import org.headfirstdesignpattern.chapter1.Duck;
import org.headfirstdesignpattern.chapter1.behaviours.fly.FlyWithWings;
import org.headfirstdesignpattern.chapter1.behaviours.quack.Quacking;
import org.headfirstdesignpattern.chapter1.behaviours.swim.Swimming;


public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quacking();
        flyBehaviour = new FlyWithWings();
        swimBehaviour = new Swimming();
    }

    @Override
    public void display(){
        System.out.println("This is a Mallard Duck");
    }
}
