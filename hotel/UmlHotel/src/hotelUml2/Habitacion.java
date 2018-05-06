package hotelUml2;

import umlhotel.*;

enum Estado{
    LIBRE,
    OCUPADO
};
/**
 * clase que almacena los atributos de la habitacion
 * @author liken
 */
public class Habitacion {
    private String numeroHabitacion;
    private Estado estado;
    private int camas;
    private Hotel hotel;
    
    /**
     * Constructor de clase
     * @param numeroHabitacion identificador
     * @param estado ocupado o desocupado
     * @param camas numero de camas que tiene la habitacion
     * @param hotel hotel al que pertenece
     */
    public Habitacion(String numeroHabitacion, Estado estado, int camas, Hotel hotel){
        super();
        this.numeroHabitacion = numeroHabitacion;
        this.estado = estado;
        this.camas = camas;
        this.hotel = hotel;
    }
    // GETTERS SETTERS
    /**
     * recupera el numero de habitacion
     * @return cadena con el numero
     */
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }
    /**
     * metodo para redefinir el numero de la habitacion
     * @param numeroHabitacion cadena con el nuevo nummero
     */
    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    /**
     * metodo que recupera el estado de la habitacion
     * @return OCUPADA o DESOCUPADA segun como se encuentre
     */
    public Estado getEstado() {
        return estado;
    }
    /**
     * metodo para definir el estado de la habitacion
     * @param estado nuevo estado OCUPADO o DESOCUPADO
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    /**
     * devuelve el numero de camas 
     * @return numero entero de camas
     */
    public int getCamas() {
        return camas;
    }
    /**
     * metodo para definir el numero de camas de la habitacion
     * @param camas el numero de camas
     */
    public void setCamas(int camas) {
        this.camas = camas;
    }
    /**
     * metodo que devuelve el Hotel al que pertenece
     * @return Instancia de tipo hotel
     */
    public Hotel getHotel() {
        return hotel;
    }
    /**
     * metodo que sirve para redefinir el hotel de la habitacion
     * @param hotel nuevo hotel
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    
}
