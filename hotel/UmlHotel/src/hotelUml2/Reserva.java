/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelUml2;

import umlhotel.*;
import java.util.GregorianCalendar;

/**
 *
 * @author liken
 */
public class Reserva {
    
    private int nuemeroReserva;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;
    private int numeroPersonas;
    private Habitacion habitacion;
    /**
     * cosntructor por defecto
     */
    public Reserva(){
        super();
    }
    /**
     * constructor de clase 
     * @param numeroReserva
     * @param fechaEntrada
     * @param fechaSalida
     * @param numeroPersonas 
     */
    public Reserva(int numeroReserva, GregorianCalendar fechaEntrada
                , GregorianCalendar fechaSalida, int numeroPersonas
                , Habitacion habitacion){
        super();
        this.nuemeroReserva = numeroPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida  = fechaSalida;
        this.habitacion  = habitacion;
    }
    public int getNuemeroReserva() {
        return nuemeroReserva;
    }

    public void setNuemeroReserva(int nuemeroReserva) {
        this.nuemeroReserva = nuemeroReserva;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
}
