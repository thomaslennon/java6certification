/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author eeitlen
 */
public enum Animals {

    DOG("woof"), CAT("MEOW"), FISH("BURBLE");
    String sound;

    Animals(String sound) {
        this.sound = sound;
    }
}

class TestEnum {

    
}
