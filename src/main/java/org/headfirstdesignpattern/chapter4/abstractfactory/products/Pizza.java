package org.headfirstdesignpattern.chapter4.abstractfactory.products;

import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.cheese.Cheese;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.clam.Clams;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.dough.Dough;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.pepperoni.Pepperoni;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.sauce.Sauce;
import org.headfirstdesignpattern.chapter4.abstractfactory.ingredients.veggie.Veggie;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;
    protected Veggie[] veggies;

    public abstract void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
