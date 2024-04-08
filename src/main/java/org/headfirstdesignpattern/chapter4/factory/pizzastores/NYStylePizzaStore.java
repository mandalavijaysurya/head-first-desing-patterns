package org.headfirstdesignpattern.chapter4.factory.pizzastores;

import org.headfirstdesignpattern.chapter4.factory.products.*;
import org.headfirstdesignpattern.chapter4.factory.products.cheesepizzas.NYStyleCheesePizza;
import org.headfirstdesignpattern.chapter4.factory.products.clampizzas.NYStyleClamPizza;
import org.headfirstdesignpattern.chapter4.factory.products.pepperonipizzas.NYStylePepperoniPizza;
import org.headfirstdesignpattern.chapter4.factory.products.pizzatypes.PizzaType;
import org.headfirstdesignpattern.chapter4.factory.products.veggiepizzas.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore{

    //Factory method
    @Override
    public Pizza createPizza(PizzaType type) {
       return switch (type) {
           case CHEESE -> new NYStyleCheesePizza();
           case CLAM_PIZZA -> new NYStyleClamPizza();
           case PEPPERONI_PIZZA -> new NYStylePepperoniPizza();
           case VEGGIE_PIZZA -> new NYStyleVeggiePizza();
           default -> null;
       };
    }
}
