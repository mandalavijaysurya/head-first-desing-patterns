package org.headfirstdesignpattern.chapter1.designpuzzle.characters;

import org.headfirstdesignpattern.chapter1.designpuzzle.weaponbehaviours.SwordBehaviour;

public class King extends Character {

    public King(){
        weapon = new SwordBehaviour();
    }
    @Override
    public void fight() {
        System.out.println("King is fighting");
    }

}
