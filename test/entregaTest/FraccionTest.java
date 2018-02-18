/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaTest;

import org.junit.Test;
import static org.junit.Assert.*;
import entrega.Fraccion;
/**
 *
 * @author liken
 */
public class FraccionTest {
    @Test
    public  void FraccionTest() {
        int numerador = 5;
        int denominador = 2;
        //constructor solo un argumento
        Fraccion fraccion = new Fraccion(numerador);
        assertEquals("5" , fraccion.aString() );
        //constructor dos argumentos
        fraccion = new Fraccion(numerador,denominador);
        assertEquals("5/2", fraccion.aString());
        //intento elementos vacios
        //fraccion = new Fraccion((null);
    }
    
}
