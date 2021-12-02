/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculatricesonar.calculatricesonar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VirtualMachine
 */
public class CalculatriceJenkinsIT {
    
    public CalculatriceJenkinsIT() {
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
     * Test of main method, of class CalculatriceJenkins.
     */
    
    @Test
    public void testAjouter() {
        // donn�es d'entr�es
        CalculatriceJenkins calc = new CalculatriceJenkins(4, 5);
        // r�sultat attendu
        int resultatAttendu = 9;
        // r�sultat effectif
        int resultatEffectif = calc.ajouter();
        // v�rification
        assertEquals(resultatAttendu, resultatEffectif);
    }
    
    @Test
    public void testSoustraire() {
        // donn�es d'entr�es
        CalculatriceJenkins calc = new CalculatriceJenkins(5, 4);
        // r�sultat attendu
        int resultatAttendu = 1;
        // r�sultat effectif
        int resultatEffectif = calc.soustraire();
        // v�rification
        assertEquals(resultatAttendu, resultatEffectif);
    }
    
    @Test
    public void testMultiplier() {
        // donn�es d'entr�es
        CalculatriceJenkins calc = new CalculatriceJenkins(4, 5);
        // r�sultat attendu
        int resultatAttendu = 20;
        // r�sultat effectif
        int resultatEffectif = calc.multiplier();
        // v�rification
        assertEquals(resultatAttendu, resultatEffectif);
    }
    
    @Test
    public void testDiviser() {
        // donn�es d'entr�es
        CalculatriceJenkins calc = new CalculatriceJenkins(20, 4);
        // r�sultat attendu
        int resultatAttendu = 5;
        // r�sultat effectif
        int resultatEffectif = calc.diviser();
        // v�rification
        assertEquals(resultatAttendu, resultatEffectif);
    }
    
    //@Test
    /*public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatriceJenkins.main(args);
        assertTrue(true);
        // TODO review the generated test code anassertTfail("The test case is a prototype.");
    }*/
    
}
