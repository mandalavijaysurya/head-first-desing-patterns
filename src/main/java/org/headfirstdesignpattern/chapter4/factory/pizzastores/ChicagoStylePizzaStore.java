package org.headfirstdesignpattern.chapter4.factory.pizzastores;

import org.headfirstdesignpattern.chapter4.factory.products.*;
import org.headfirstdesignpattern.chapter4.factory.products.cheesepizzas.ChicagoStyleCheesePizza;
import org.headfirstdesignpattern.chapter4.factory.products.clampizzas.ChicagoStyleClamPizza;
import org.headfirstdesignpattern.chapter4.factory.products.pepperonipizzas.ChicagoStylePepperoniPizza;
import org.headfirstdesignpattern.chapter4.factory.products.pizzatypes.PizzaType;
import org.headfirstdesignpattern.chapter4.factory.products.veggiepizzas.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new ChicagoStyleCheesePizza();
            case CLAM_PIZZA -> new ChicagoStyleClamPizza();
            case PEPPERONI_PIZZA -> new ChicagoStylePepperoniPizza();
            case VEGGIE_PIZZA -> new ChicagoStyleVeggiePizza();
            default -> null;
        };
    }
}
