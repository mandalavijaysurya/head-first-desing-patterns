package org.headfirstdesignpattern.chapter4.factory.products;

import org.headfirstdesignpattern.chapter4.factory.ingredients.factory.IngredientsFactory;
import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

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
