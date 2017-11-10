
package entornosdedesarrollo;
    import javax.swing.*;
/**
 *esta es la clase principal del proyecto creado para Entornos de Desarrollo
 * aqui se inicia el proyecto al ejecutar.
 * @author liken
 */
public class EntornosDeDesarrollo extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona paco=new Persona(20,"Paco","hombre");
        Persona maria = new Persona(14,"maria","mujer");
        System.out.println(paco.saludo());
        System.out.println(paco.compareTo(maria));
        JFrame patata= new JFrame("patata");
        
        
        patata.setSize(300, 300);
        patata.add(new JTextField("hola que tal"));
        patata.setVisible(true);
        patata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
