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
public class Individual extends Habitacion {
    private String categoria;
    /**
     * constructor sin atributos individual
     * @param numeroHabitacion
     * @param estado
     * @param camas
     * @param hotel 
     */
    public Individual(String numeroHabitacion, Estado estado, int camas, Hotel hotel) {
        super(numeroHabitacion, estado, camas, hotel);
    }
    /**
     * constructor con atributos de individual
     * @param categoria
     * @param numeroHabitacion
     * @param estado
     * @param camas
     * @param hotel 
     */
    public Individual(String categoria, String numeroHabitacion, Estado estado, int camas, Hotel hotel) {
        super(numeroHabitacion, estado, camas, hotel);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    ////////////////////////////////////////
    /**
     * metodo para devolver la cantidad de la rebaja 
     * @param precio
     * @param rebaja en porcentaje
     * @return 
     */
    public double calculoRebaja(double precio,double rebaja){
           return precio * (rebaja/100);
    }
    
}
