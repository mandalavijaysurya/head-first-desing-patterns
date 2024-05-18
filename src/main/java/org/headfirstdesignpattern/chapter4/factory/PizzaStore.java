package org.headfirstdesignpattern.chapter4.factory;

import org.headfirstdesignpattern.chapter4.factory.enums.PizzaType;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(){
        factory = new SimplePizzaFactory();
    }
    public Pizza orderPizza(PizzaType type){
        Pizza pizza = factory.createPizza(type);
        pizza.bake();
        pizza.pack();
        return pizza;
    }



}
