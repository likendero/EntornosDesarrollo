/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaTest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import entrega.TablaEnteros;
import java.util.NoSuchElementException;

/**
 *
 * @author liken
 */
public class tablaTest {
    static Integer tabla[] = new Integer[10];
    static TablaEnteros tablilla;
   @BeforeClass
   public static void beforeClass(){
       for(int i = 0; i<tabla.length ; i++ ){
           tabla[i]=i;
       }
       tablilla = new TablaEnteros(tabla);
   }
    @Test
    public void testSuma(){
        //prueba de la suma
        System.out.println("suma");
        assertEquals(45, tablilla.sumaTabla());
    }
    @Test
    public void testMayor(){
        // prueba mayor
        System.out.println("mayor");
        assertEquals(9,tablilla.mayorTabla());
    }
    @Test 
    public void testTabla(){
        // prueba constructores
        Integer entero[] = new Integer[0];
        //caso 0
        try{
            new TablaEnteros(entero);
            fail("no ha saltado la ");
        }
        catch(IllegalArgumentException il){
            
        }
        //caso null
        entero = null;
        try{
            new TablaEnteros(entero);
            fail("no ha saltado la ");
        }
        catch(IllegalArgumentException il){
            
        }
    }
    @Test
    public void testPosicionTabla(){
        //test posicion
        System.out.println("posicion");
        assertEquals(9,tablilla.posicionTabla(9));
        try{
            tablilla.posicionTabla(33);
            fail("no se ha ejecutado la excepcion");
        }
        catch(NoSuchElementException nS){
                
        }
    }
    }

