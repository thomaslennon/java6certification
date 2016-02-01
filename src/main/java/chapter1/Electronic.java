/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author eeitlen
 */
public class Electronic implements Device {
    public void doIt(){}
}

abstract class Phone1  extends Electronic{}

abstract class Phone2 extends Electronic{
    public void doStuff() {}
}

class Phone3 extends Electronic implements Device{
    public void doStuff(){};
}

interface Device{
    void doIt();
}
