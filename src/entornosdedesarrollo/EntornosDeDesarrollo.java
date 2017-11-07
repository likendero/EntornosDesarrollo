
package entornosdedesarrollo;

/**
 *esta es la clase principal del proyecto creado para Entornos de Desarrollo
 * aqui se inicia el proyecto al ejecutar.
 * @author liken
 */
public class EntornosDeDesarrollo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona paco=new Persona(20,"Paco","hombre");
        Persona maria = new Persona(14,"maria","mujer");
        System.out.println(paco.saludo());
        System.out.println(paco.compareTo(maria));
        
    }
    
}
