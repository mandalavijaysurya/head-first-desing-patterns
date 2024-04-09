package org.headfirstdesignpattern.chapter4.factory.ingredients.factory;

import org.headfirstdesignpattern.chapter4.factory.ingredients.cheese.Cheese;
import org.headfirstdesignpattern.chapter4.factory.ingredients.cheese.ReggianoCheese;
import org.headfirstdesignpattern.chapter4.factory.ingredients.clam.Clams;
import org.headfirstdesignpattern.chapter4.factory.ingredients.clam.FreshClams;
import org.headfirstdesignpattern.chapter4.factory.ingredients.dough.Dough;
import org.headfirstdesignpattern.chapter4.factory.ingredients.dough.ThinCrustDough;
import org.headfirstdesignpattern.chapter4.factory.ingredients.pepperoni.Pepperoni;
import org.headfirstdesignpattern.chapter4.factory.ingredients.pepperoni.SlicedPepperoni;
import org.headfirstdesignpattern.chapter4.factory.ingredients.sauce.MarinaraSauce;
import org.headfirstdesignpattern.chapter4.factory.ingredients.sauce.Sauce;
import org.headfirstdesignpattern.chapter4.factory.ingredients.veggie.*;

public class NYStyleIngredientsFactory implements IngredientsFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createveggies() {
        return new Veggie[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
