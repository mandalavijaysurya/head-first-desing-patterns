package org.headfirstdesignpattern.chapter1.designpuzzle.characters;

import org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours.AxeBehaviour;


public class Troll extends Character{

    public Troll(){
        weapon = new AxeBehaviour();
    }
    @Override
    public void fight() {
        System.out.println("Troll is fighting");
    }

}
