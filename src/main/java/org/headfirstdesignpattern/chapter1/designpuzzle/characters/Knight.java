package org.headfirstdesignpattern.chapter1.designpuzzle.characters;

import org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours.BowAndArrowBehaviour;

public class Knight extends Character{
    public Knight(){
        weapon = new BowAndArrowBehaviour();
    }
    @Override
    public void fight() {
        System.out.println("Knight is fighting");
    }
}
