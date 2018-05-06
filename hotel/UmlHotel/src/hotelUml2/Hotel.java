/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelUml2;

import umlhotel.*;

/**
 *  clase que guarda los atributos del hotel
 * @author liken
 */
public class Hotel {
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    
    /**
     * constructor parametrizado del hotel
     * @param codigo identificacion unica del hotel
     * @param nombre del hotel
     * @param direccion completa del hotel
     * @param telefono  pos eso
     */
    public Hotel(String codigo, String nombre, String direccion, String telefono){
    super();
    this.codigo = codigo;
    this.direccion = direccion;
    this.nombre = nombre;
    this.telefono = telefono;
    }
    // GETTERS SETTERS
    /**
     * metodo para rescatar el codigo del hotel
     * @return codigo dentro de una cadena
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * metodo para redefinir el codigo del hotel
     * @param codigo 
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * metodo para rescatar el nombre del hotel
     * @return cadena con el nombre del hotel
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo para re definir el nombre del hotel
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que devuelve la direccion del hotel
     * @return cadena con la direccion
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * metodo para redefinir la direccion del hotel
     * @param direccion nueva direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * metodo que devuelve el telefono del hotel
     * @return telefono dentro de una cadena
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * metodo para redefinir el telefono de un hotel 
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
