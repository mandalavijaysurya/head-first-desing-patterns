package org.headfirstdesignpattern.chapter7;

import org.headfirstdesignpattern.chapter7.ducks.Duck;
import org.headfirstdesignpattern.chapter7.turkeys.Turkey;

public class TurkeyAdapter implements Duck {
    private final Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void fly() {
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
