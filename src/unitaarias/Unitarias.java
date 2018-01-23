/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitaarias;

/**
 *
 * @author liken
 */
    import java.util.Scanner;
public class Unitarias {
    private static Scanner key = new Scanner(System.in);
    public static int divisor(int numerador,int denominador){
        try{
            return numerador/denominador;
        }catch(Exception ex){
            System.out.println("error");
            if(denominador == 0){
                System.out.println("denominador cambiado por 1");
                denominador = 1;
            }
        }
        return numerador/denominador;
}
    public static void main(String[] args) {
        int numerador, denominador;
        System.out.println("introduce numerador");
        numerador = key.nextInt();
        System.out.println("introduce denominador");
        denominador = key.nextInt();
        System.out.println("la division es: ");
        System.out.println(divisor(numerador, denominador));
    }
}
