package org.headfirstdesignpattern.chapter4.factory;

import org.headfirstdesignpattern.chapter4.factory.pizzastores.NYStylePizzaStore;
import org.headfirstdesignpattern.chapter4.factory.pizzastores.PizzaStore;
import org.headfirstdesignpattern.chapter4.factory.products.Pizza;
import org.headfirstdesignpattern.chapter4.factory.products.pizzatypes.PizzaType;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaType.CLAM_PIZZA);
    }
}
