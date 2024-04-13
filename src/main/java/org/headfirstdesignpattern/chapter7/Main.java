package org.headfirstdesignpattern.chapter7;

import org.headfirstdesignpattern.chapter7.ducks.Duck;
import org.headfirstdesignpattern.chapter7.ducks.MallardDuck;
import org.headfirstdesignpattern.chapter7.turkeys.Turkey;
import org.headfirstdesignpattern.chapter7.turkeys.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new MallardDuck();
        System.out.println("-------- Using Mallard Duck Instance --------");
        duck.quack();
        duck.fly();
        System.out.println("-------- Using Wild Turkey Instance --------");
        turkey.gobble();
        turkey.fly();
        duck = new TurkeyAdapter(turkey);
        System.out.println("-------- Using Turkey Adapter Instance --------");
        duck.quack();
        duck.fly();
    }
}
