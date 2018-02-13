/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import entornosdedesarrollo.Persona;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author liken
 */
public class PersonaTest {
    // creacion de personas
    static Persona persona1;
    static Persona persona2;
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public void setUpClass(){
        persona1 = new Persona();
        persona2 = new Persona(23,"hombre","juan");
    }
    
}
