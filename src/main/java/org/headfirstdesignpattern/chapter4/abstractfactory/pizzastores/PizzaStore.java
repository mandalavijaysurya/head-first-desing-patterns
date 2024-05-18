package org.headfirstdesignpattern.chapter4.abstractfactory.pizzastores;

import org.headfirstdesignpattern.chapter4.abstractfactory.products.Pizza;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.pizzatypes.PizzaType;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
