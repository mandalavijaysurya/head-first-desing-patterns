package org.headfirstdesignpattern.chapter4.abstractfactory.products;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory.IngredientsFactory;

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
