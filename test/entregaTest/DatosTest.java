/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaTest;
import entrega.Fraccion;
/**
 *
 * @author likendero
 */
public class DatosTest {
    public static void main(String[] args) {
        try{
            Fraccion fraccionTest = Fraccion.datos();
            System.out.println(fraccionTest.aString());
        }
        catch(ArithmeticException arith){
            System.out.println(arith.getMessage());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
