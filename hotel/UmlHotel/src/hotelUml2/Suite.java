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
public class Suite extends Habitacion{
    private double metros;
    private String servicios;
    /**
     * constructor sin atributos de suite
     * @param numeroHabitacion
     * @param estado
     * @param camas
     * @param hotel 
     */
    public Suite(String numeroHabitacion, Estado estado, int camas, Hotel hotel) {
        super(numeroHabitacion, estado, camas, hotel);
    }
    /**
     * constructor con los atributos de suite
     * @param metros
     * @param servicios
     * @param numeroHabitacion
     * @param estado
     * @param camas
     * @param hotel 
     */
    public Suite(double metros, String servicios, String numeroHabitacion, Estado estado, int camas, Hotel hotel) {
        super(numeroHabitacion, estado, camas, hotel);
        this.metros = metros;
        this.servicios = servicios;
    }
    /**
     * calculo de del precio de gasto segun metros
     * @return gastos
     */
    public double calculoGastos(){
        return this.metros/5 * 10;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
    
}
