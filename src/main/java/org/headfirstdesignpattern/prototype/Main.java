package org.headfirstdesignpattern.prototype;

import org.headfirstdesignpattern.prototype.concretes.Maruti;
import org.headfirstdesignpattern.prototype.concretes.Tata;

public class Main {
    public static void main(String[] args) {
        Tata tata1 = new Tata();
        tata1.setColor("Something");
        tata1.setManufacturingYear(1994);
        tata1.setModelName("Indica");
        Tata tata2 = tata1.clone();
        System.out.println(tata1);
        System.out.println(tata2);
        System.out.println("---------------------------------------");
        Maruti maruti = new Maruti();
        Maruti maruti1 = maruti.clone();
    }
}
