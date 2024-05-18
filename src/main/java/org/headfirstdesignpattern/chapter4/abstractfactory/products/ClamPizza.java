package org.headfirstdesignpattern.chapter4.abstractfactory.products;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory.IngredientsFactory;

public class ClamPizza extends Pizza {
    IngredientsFactory ingredientsFactory;

    public ClamPizza(IngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        ingredientsFactory.createDough();
        ingredientsFactory.createSauce();
        ingredientsFactory.createCheese();
        ingredientsFactory.createClam();
    }
}
