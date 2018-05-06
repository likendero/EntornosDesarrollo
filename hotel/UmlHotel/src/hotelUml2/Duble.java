/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelUml2;

/**
 *
 * @author liken
 */
public class Duble extends Habitacion {
    private boolean minibar;
    private String extra;

    public Duble(String numeroHabitacion, Estado estado, int camas, Hotel hotel) {
        super(numeroHabitacion, estado, camas, hotel);
    }

    public Duble(boolean minibar, String extra, String numeroHabitacion, Estado estado, int camas, Hotel hotel) {
        super(numeroHabitacion, estado, camas, hotel);
        this.minibar = minibar;
        this.extra = extra;
    }
    
    
}
