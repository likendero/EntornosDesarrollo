/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author liken
 */
public class patata {
    public static void main(String[] args) {
        pp jaja = new pp("que tal wapa");
        pp jaja2 = jaja;
        
        System.out.println(jaja.toString());
        System.out.println(jaja2.toString());
        jaja.setHola("mandolina");
        System.out.println(jaja.toString());
        System.out.println(jaja2.toString());
    }
}
class pp{
    private String hola;
    
    public pp(String hola){
        super();
        this.hola = hola;
    }
    @Override
    public String toString ()
    {
        return hola;
    }
    public void setHola(String hola)
    {
        this.hola = hola;
    }
}
