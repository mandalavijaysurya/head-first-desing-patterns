package org.headfirstdesignpattern.chapter7;

import org.headfirstdesignpattern.chapter7.ducks.Duck;
import org.headfirstdesignpattern.chapter7.ducks.MallardDuck;
import org.headfirstdesignpattern.chapter7.enumerationIterator.EnumerationIteratorAdapter;
import org.headfirstdesignpattern.chapter7.turkeys.Turkey;
import org.headfirstdesignpattern.chapter7.turkeys.WildTurkey;

import java.util.Enumeration;
import java.util.Stack;

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
        Stack<Integer> integerStack = new Stack<>();
        for(int i = 0; i < 10; i++){
            integerStack.push(i);
        }
        System.out.println("-------- Using Enumeration-Iteration Adapter --------");
        Enumeration<Integer> enumeration = integerStack.elements();
        EnumerationIteratorAdapter<Integer> adapter = new EnumerationIteratorAdapter<>(enumeration);
        while(adapter.hasNext()){
            System.out.print(adapter.next()+ " ");
        }
        System.out.println();
    }

}
