/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCalculadora;

//import entornos_Graficos.calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author liken
 */
public class AppCalculadoraTest {
    
    public AppCalculadoraTest() {
    }
    public static AppCalculadora calcu;
    @BeforeClass
    public static void setUpClass() {
        calcu = new AppCalculadora(20, 10);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    //creacion de instancia de calculadora
   /* AppCalculadora calcu;
    @Before
    public void setUp() {
        calcu = new AppCalculadora(20, 10);
    }*/
    
    /*@After
    public void tearDown() {
       calcu = null;
    }*/

    /**
     * Test of suma method, of class AppCalculadora.
     */
    @Test
    public void testSuma() {
       // AppCalculadora calcu = new AppCalculadora(30,10);
        int sum = calcu.suma();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(30,sum);
    }

    /**
     * Test of resta method, of class AppCalculadora.
     */
    @Test
    public void testResta() {
        //AppCalculadora calcu = new AppCalculadora(10,10);
        int rest = calcu.resta();
        assertEquals(10, rest);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multplica method, of class AppCalculadora.
     */
    @Test
    public void testMultplica() {
        
       // AppCalculadora calcu = new AppCalculadora(10,10);
        int multi = calcu.multplica();
        assertEquals(200, multi);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of diiide method, of class AppCalculadora.
     */
    @Test
    public void testDiiide() {
           // AppCalculadora calcu = new AppCalculadora(10,10);
            int div = calcu.diiide();
            assertEquals(2, div);
            //AppCalculadora calcu2 = new AppCalculadora(10,0);
            calcu = new AppCalculadora(20, 0);
            div = calcu.diiide();
            assertEquals(0, div);
        // TODO review the generated test code and remove the default call to fail.
        
    }
   
   /* public void testDiiide2(){
        
    }*/
    
}
