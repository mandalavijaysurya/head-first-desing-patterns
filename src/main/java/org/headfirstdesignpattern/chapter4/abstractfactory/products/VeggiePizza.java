package org.headfirstdesignpattern.chapter4.abstractfactory.products;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory.IngredientsFactory;

public class VeggiePizza extends Pizza {

    IngredientsFactory ingredientsFactory;
    public VeggiePizza(IngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        ingredientsFactory.createDough();
        ingredientsFactory.createSauce();
        ingredientsFactory.createSauce();
        ingredientsFactory.createveggies();
    }
}
