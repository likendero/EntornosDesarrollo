/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlhotel;

/**
 *
 * @author liken
 */
public class Clientes {
    private int numCliente;
    private String nombre;
    private String telefono;
    /**
     * constructor por defecto
     */
    public Clientes() {
        super();
    }
    /**
     * Constructor de clase
     * @param numCliente
     * @param nombre
     * @param telefono 
     */
    public Clientes(int numCliente, String nombre, String telefono) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
