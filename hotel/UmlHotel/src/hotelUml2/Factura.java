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
public class Factura {
    private int numeroReserva;
    private GregorianCalendar fechaEntrada;
    private double importe;
    private double iva;
    /**
     * constructor por defecto
     */
    public Factura(){
        super();
    }
    /**
     * constructor de clase
     * @param numeroReserva
     * @param fechaEntrada
     * @param importe
     * @param iva 
     */
    public Factura( int numeroReserva,
                    GregorianCalendar fechaEntrada,
                    double importe,
                    double iva){
        super();
        this.numeroReserva = numeroReserva;
        this.fechaEntrada = fechaEntrada;
        this.importe = importe;
        this.iva = iva;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
}
