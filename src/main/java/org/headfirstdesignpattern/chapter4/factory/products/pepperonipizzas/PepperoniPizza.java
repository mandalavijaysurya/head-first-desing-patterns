package org.headfirstdesignpattern.chapter4.factory.products.pepperonipizzas;

import org.headfirstdesignpattern.chapter4.factory.ingredients.factory.IngredientsFactory;
import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

public class PepperoniPizza extends Pizza {

    IngredientsFactory ingredientsFactory;

    public PepperoniPizza(IngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        ingredientsFactory.createDough();
        ingredientsFactory.createSauce();
        ingredientsFactory.createCheese();
        ingredientsFactory.createPepperoni();
    }
}
