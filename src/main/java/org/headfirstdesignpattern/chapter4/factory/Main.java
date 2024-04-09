package org.headfirstdesignpattern.chapter4.factory;

import org.headfirstdesignpattern.chapter4.factory.pizzastores.ChicagoStylePizzaStore;
import org.headfirstdesignpattern.chapter4.factory.pizzastores.NYStylePizzaStore;
import org.headfirstdesignpattern.chapter4.factory.pizzastores.PizzaStore;
import org.headfirstdesignpattern.chapter4.factory.products.Pizza;
import org.headfirstdesignpattern.chapter4.factory.products.pizzatypes.PizzaType;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.PEPPERONI_PIZZA);
        System.out.println(pizza.getName());

    }
}
