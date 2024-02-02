package org.headfirstdesignpattern.chapter1;

import org.headfirstdesignpattern.chapter1.behaviours.fly.FlyBehaviour;
import org.headfirstdesignpattern.chapter1.behaviours.quack.QuackBehaviour;
import org.headfirstdesignpattern.chapter1.behaviours.swim.SwimBehaviour;

public abstract class Duck {

    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;
    protected SwimBehaviour swimBehaviour;

    public abstract void  display();

    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
    public void performSwim(){
        swimBehaviour.swim();
    }
}
