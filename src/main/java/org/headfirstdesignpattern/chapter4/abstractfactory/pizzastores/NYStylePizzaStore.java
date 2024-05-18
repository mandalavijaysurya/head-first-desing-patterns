package org.headfirstdesignpattern.chapter4.abstractfactory.pizzastores;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory.IngredientsFactory;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory.NYStyleIngredientsFactory;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.*;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.CheesePizza;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.ClamPizza;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.PepperoniPizza;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.pizzatypes.PizzaType;
import org.headfirstdesignpattern.chapter4.abstractfactory.products.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        IngredientsFactory ingredientsFactory = new NYStyleIngredientsFactory();
        if(type.equals(PizzaType.CHEESE)){
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("New york Style Cheese Pizza");
        }else if(type.equals(PizzaType.VEGGIE_PIZZA)){
            pizza = new VeggiePizza(ingredientsFactory);
            pizza.setName("New york Style Veggie Pizza");
        }else if(type.equals(PizzaType.CLAM_PIZZA)){
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("New york Style Clam Pizza");
        }else if(type.equals(PizzaType.PEPPERONI_PIZZA)){
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("New york Style Pepperoni Pizza");
        }
        return pizza;
    }
}
