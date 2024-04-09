package org.headfirstdesignpattern.chapter4.factory.products;

import org.headfirstdesignpattern.chapter4.factory.ingredients.factory.IngredientsFactory;
import org.headfirstdesignpattern.chapter4.factory.products.Pizza;

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
