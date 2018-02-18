/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaTest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import entrega.Fraccion;
import org.junit.AfterClass;

/**
 *
 * @author likendero
 */
public class FraccionMetodosTest {
    static Fraccion fraccion1,fraccion2,fraccion3,fraccion4;
    @BeforeClass
    public static void setUpClass(){
    fraccion1 = new Fraccion(5);
    fraccion2 = new Fraccion(7,4);
    fraccion3 = new Fraccion(-4,3);
    fraccion4 = new Fraccion(0);
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("fin de la prueba");
    }
    @Test
    public void testSuma(){
        System.out.println("suma");
        //prueba suma1
        Fraccion resultado = new Fraccion(7,4);
        assertEquals(resultado.aString(),Fraccion.sumar(fraccion1, fraccion2).aString());
        //prueba suma2
        resultado = new Fraccion(5,12);
        assertEquals(resultado.aString(),Fraccion.sumar(fraccion2, fraccion3).aString());
        //prueba suma3
        assertEquals(fraccion1.aString(),Fraccion.sumar(fraccion1, fraccion4).aString());
    }
    @Test
    public void testResta(){
        System.out.println("resta");
        //prueba resta1
        Fraccion resultado = new Fraccion(13,4);
        assertEquals(resultado.aString(),Fraccion.restar(fraccion1, fraccion2).aString());
        //prueba resta2
        resultado = new Fraccion(37,12);
        assertEquals(resultado.aString(),Fraccion.restar(fraccion2, fraccion3).aString());
        //prueba resta3
        resultado = new Fraccion(5);
        assertEquals(resultado.aString(),Fraccion.restar(fraccion1, fraccion4).aString());
    }
    @Test
    public void testMultiplicar(){
        System.out.println("multiplicaccion");
        Fraccion resultado = new Fraccion(-28,12);
        assertEquals(resultado.aString(),Fraccion.sumar(fraccion2, fraccion3).aString());
    }
    @Test
    public void testInversa(){
        System.out.println("inversa");
        Fraccion resultado = new Fraccion(4,7);
        assertEquals(resultado.aString(),Fraccion.inversa(fraccion2).aString());
    }
    @Test
    public void testDivision(){
    Fraccion resultado = new Fraccion(20,7);
    assertEquals(resultado.aString(),Fraccion.dividir(fraccion1, fraccion2).aString());
    try{
        fraccion1.dividir(fraccion2, fraccion4);
        fail("se ha intentado dividir por 0");
    }
    catch(ArithmeticException arith){
        System.out.println(arith.getMessage());
    }
    }
}
