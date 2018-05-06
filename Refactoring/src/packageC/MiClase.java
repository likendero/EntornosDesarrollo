
package packageC;

import java.util.Date;

/**
 *  ejercico de refactorizacion
 * @author Javier Gonzalez Rives
 */
public class MiClase extends NewClass implements InterfazExtraida {
    private String patata;
    private String mandolina;
    
    private int cantidad;
    
    private double peso;
    
    private boolean podrido;
    private boolean comestible;
    
    private Date dia;
    /**
     * constructor por defecto
     * 
     */
    public MiClase() {
    }
    
    /**
     * constructor de clase
     * @param patata
     * @param mandolina
     * @param boniato
     * @param cantidad
     * @param calidad
     * @param peso
     * @param podrido
     * @param comestible
     * @param dia 
     */
    public MiClase(String patata, String mandolina, String boniato, int cantidad, int calidad, double peso, boolean podrido, boolean comestible, Date dia) {
        this.patata = patata;
        this.mandolina = mandolina;
        this.boniato = boniato;
        this.cantidad = cantidad;
        this.calidad = calidad;
        this.peso = peso;
        this.podrido = podrido;
        this.comestible = comestible;
        this.dia = dia;
    }
    
    /**
     * @return the patata
     */
    public String getPatata() {
        return patata;
    }

    /**
     * @param patata the patata to set
     */
    public void setPatata(String patata) {
        this.patata = patata;
    }

    /**
     * @return the mandolina
     */
    public String getMandolina() {
        return mandolina;
    }

    /**
     * @param mandolina the mandolina to set
     */
    public void setMandolina(String mandolina) {
        this.mandolina = mandolina;
    }


    /**
     * @param boniato the boniato to set
     */
    public void setBoniato(String boniato) {
        this.boniato = boniato;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * @param calidad the calidad to set
     */
    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the podrido
     */
    public boolean isPodrido() {
        return podrido;
    }

    /**
     * @param podrido the podrido to set
     */
    public void setPodrido(boolean podrido) {
        this.podrido = podrido;
    }

    /**
     * @return the comestible
     */
    public boolean isComestible() {
        return comestible;
    }

    /**
     * @param comestible the comestible to set
     */
    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    /**
     * @return the dia
     */
    public Date getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Date dia) {
        this.dia = dia;
    }
    /////////////////////////////////////////////////////////
    /**
     * metodo que sirve para calcular el peso por cantidad
     * @param cantidad
     * @param peso
     * @return 
     */
    private static double pesoCantidad(int cantidad, double peso){
        return peso/(double)cantidad;
    } 
    /**
     *Metodo que analiza la calidad de tu numero
     * @param numero el numero introducido
     */
    public static String calificaTuNumero(int numero){
        //caso que sea un buen numero
        if(numero == 11){
            return "buen numero";
        }
        // caso que no lo sea
        return "es un numero horrible";
    }
    /**
     * metodo que annade una bonita carita a un texto
     * @param texto
     * @return 
     */
    public static String annadirCarita(String texto){
        return texto + " :D ";
    }
    /**
     * te aconseja sobres los kilos
     * @return 
     */
    @Override
    public String kilitos(){
        if(this.getPeso() >= 50){
            return this.getPeso() + " eso es un monton muyayo";
        }
        return this.getPeso() + " eso es mu poco muyayo";
    }
    /**
     * metodo para annadir o quitar kilos, segun el numero sea negativo o positivo
     * @param incremento 
     */
    public void sumarKilos(double incremento){
        this.setPeso(this.getPeso() + incremento);
    }
}
