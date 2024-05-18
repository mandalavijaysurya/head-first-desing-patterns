package org.headfirstdesignpattern.chapter4.abstractfactory;

import org.headfirstdesignpattern.chapter4.abstractfactory.pizzastores.ChicagoStylePizzaStore;
import org.headfirstdesignpattern.chapter4.abstractfactory.pizzastores.PizzaStore;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.Pizza;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.pizzatypes.PizzaType;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.PEPPERONI_PIZZA);
        System.out.println(pizza.getName());

    }
}
