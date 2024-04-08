package org.headfirstdesignpattern.chapter4.factory.pizzastores;

import org.headfirstdesignpattern.chapter4.factory.products.Pizza;
import org.headfirstdesignpattern.chapter4.factory.products.pizzatypes.PizzaType;

public abstract class PizzaStore {

    public abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
