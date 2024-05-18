package org.headfirstdesignpattern.chapter4.abstractfactory.pizzastores;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory.ChicagoStyleIngredientsFactory;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory.IngredientsFactory;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.*;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.CheesePizza;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.ClamPizza;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.PepperoniPizza;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.pizzatypes.PizzaType;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.VeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        IngredientsFactory ingredientsFactory = new ChicagoStyleIngredientsFactory();
        if(type.equals(PizzaType.CHEESE)){
           pizza = new CheesePizza(ingredientsFactory);
           pizza.setName("Chicago Style Cheese Pizza");
        }else if(type.equals(PizzaType.VEGGIE_PIZZA)){
            pizza = new VeggiePizza(ingredientsFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }else if(type.equals(PizzaType.CLAM_PIZZA)){
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }else if(type.equals(PizzaType.PEPPERONI_PIZZA)){
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
