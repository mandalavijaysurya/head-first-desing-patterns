package org.headfirstdesignpattern.chapter1;

public class Duck {
    public void quack(){
        System.out.println("Quack Quack");
    }

    public void swim(){
        System.out.println("Hey I'm swimming");
    }

    public void fly(){
        System.out.println("Hey I'm flying");
    }

    public String display(){
        return this.getClass().getSimpleName();
    }
}
