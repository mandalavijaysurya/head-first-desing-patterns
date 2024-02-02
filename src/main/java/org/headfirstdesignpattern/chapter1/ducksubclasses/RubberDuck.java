package org.headfirstdesignpattern.chapter1.ducksubclasses;

import org.headfirstdesignpattern.chapter1.Duck;
import org.headfirstdesignpattern.chapter1.behaviours.fly.NoFly;
import org.headfirstdesignpattern.chapter1.behaviours.quack.Squeaking;
import org.headfirstdesignpattern.chapter1.behaviours.swim.Float;


public class RubberDuck extends Duck {
    public RubberDuck(){
        quackBehaviour = new Squeaking();
        flyBehaviour = new NoFly();
        swimBehaviour = new Float();
    }

    @Override
    public void display(){
        System.out.println("This is a Rubber Duck");
    }
}
