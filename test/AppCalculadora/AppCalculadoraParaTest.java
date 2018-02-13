/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCalculadora;
import AppCalculadora.AppCalculadora;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author liken
 */
@RunWith(Parameterized.class)
public class AppCalculadoraParaTest {
    private int nume1;
    private int nume2;
    private int resul;
    public AppCalculadoraParaTest(int nume1, int nume2, int resul) {
        this.nume1 = nume1;
        this.nume2 = nume2;
        this.resul = resul;
    }
    @Parameters
    public static ArrayList<AppCalculadoraParaTest[]> numeros() {
        AppCalculadoraParaTest app[] = {
            new AppCalculadoraParaTest(3, 3, 1),
            new AppCalculadoraParaTest(10, 2, 5),
            new AppCalculadoraParaTest(6, 0, 0)
        };
        ArrayList<AppCalculadoraParaTest[]> arr = new ArrayList<>();
        arr.add(app);
        return arr ;
    }
    @Test
    public void divtest(){
        AppCalculadora calcu = new AppCalculadora(nume1,nume2);
        int vuelta = calcu.diiide();
        assertEquals(vuelta, resul);
    }
    }
