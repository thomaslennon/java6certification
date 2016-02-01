/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author eeitlen
 */
public class AnimalsTest {
    
    static Animals a;

    public AnimalsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class Animals.
     */
    @Test
    public void testValues() {
        
        System.out.println(a.DOG.sound + " " + a.FISH.sound);

    }

    /**
     * Test of valueOf method, of class Animals.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");


    }
}