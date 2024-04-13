package org.headfirstdesignpattern.prototype.concretes;

import org.headfirstdesignpattern.prototype.ICar;

public class Tata implements ICar {

    private String modelName;
    private String color;
    private int manufacturingYear;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
    @Override
    public String toString() {
        return "Tata{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }

    @Override
    public Tata clone() {
        Tata tata = new Tata();
        tata.modelName = this.modelName;
        tata.color = this.color;
        tata.manufacturingYear = this.manufacturingYear;
        return tata;
    }
}
