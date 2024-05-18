package org.headfirstdesignpattern.chapter4.factory;

import org.headfirstdesignpattern.chapter4.factory.enums.PizzaType;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public class FactoryMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println(pizza.toString());
    }

}
