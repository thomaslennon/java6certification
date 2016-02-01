/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author eeitlen
 */
public class TestDays {
    public enum Days {MON, TUE, WED};
    public static void main (String args[]){
        for (Days d : Days.values())
            ;
        Days [] d2 = Days.values();
        System.out.println(d2[2]);
    }
    
}
