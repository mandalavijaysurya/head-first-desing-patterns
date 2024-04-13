package org.headfirstdesignpattern.prototype.concretes;

import org.headfirstdesignpattern.prototype.ICar;

public class Maruti implements ICar {
    private String modelName;
    private int manufacturingYear;
    private String color;
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Maruti clone() {
        Maruti marutiClone = new Maruti();
        marutiClone.setColor(this.color);
        marutiClone.setModelName(this.modelName);
        marutiClone.setManufacturingYear(this.manufacturingYear);
        return marutiClone;
    }

    @Override
    public String toString() {
        return "Maruti{" +
                "modelName='" + modelName + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", color='" + color + '\'' +
                '}';
    }
}
