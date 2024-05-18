package org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.factory;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.cheese.Cheese;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.cheese.ReggianoCheese;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.clam.Clams;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.clam.FreshClams;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.dough.Dough;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.dough.ThinCrustDough;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.pepperoni.Pepperoni;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.pepperoni.SlicedPepperoni;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.sauce.MarinaraSauce;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.sauce.Sauce;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.veggie.*;

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
