
package entornosdedesarrollo;

/**
 * Esta clase sirve para crear personas y que saluden, con nombre, sexo y edad 
 * @author liken
 * 
 */
public class Persona implements Comparable<Persona>{
    private int edad;
    private String sexo;
    private String nombre;
    /**
     * <h1>constructor por defecto</h1>
     * <p>constructor que aparece cuando no tiene paramatros</p>
     */
    public Persona(){
        super();
        this.edad=0;
        this.nombre="";
        this.sexo="";
    }
    /**
     * <h1>constructor completo</h1>
     * este constructor se declara con todas sus variables
     * @param edad de la persona
     * @param nombre de la persona, la primera con mayuscula por favor
     * @param sexo de la persona, <b>hombre o mujer</b>
     */
    public Persona(int edad,String nombre,String sexo){
        super();
        this.edad=edad;
        this.nombre=nombre;
        this.sexo=sexo;
    }
    /**
     * la instancia de persona devuelve un saludo con sus datos
     * @return hola + nombre + edad y el genero.
     */
    public String saludo(){
        return "hola soy "+this.getNombre()+" tengo "+ this.getEdad()+" años "
                +"y soy " + this.getSexo();
    }
    /**
     * 
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return el genero de la persona
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * 
     * @param sexo de la persona, <b> hombre o mujer </b>
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * 
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre de la persona a ser posible con la primera en mayuscula
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    /**
     * comapara las edades de dos personas, si la primera es mayor devuelve 1
     * si es menor -1 y si es igual 0
     */
    public int compareTo(Persona o) {
        if(this.edad==o.edad)return 0;
        if(this.edad>o.edad)return 1;
        else{ 
            return -1;
        }
        
    }
}
