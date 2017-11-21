package entornosDeDesarrollo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanuco {

	private JFrame frame;
	private JTextField textoCodigo;
	private JTextField textoNombre;
	private JTextField textoDireccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanuco window = new ventanuco();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanuco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		frame.getContentPane().setLayout(null);
		
		textoCodigo = new JTextField();
		textoCodigo.setBounds(228, 62, 114, 19);
		frame.getContentPane().add(textoCodigo);
		textoCodigo.setColumns(10);
		
		textoNombre = new JTextField();
		textoNombre.setBounds(228, 103, 114, 19);
		frame.getContentPane().add(textoNombre);
		textoNombre.setColumns(10);
		
		textoDireccion = new JTextField();
		textoDireccion.setBounds(228, 145, 114, 19);
		frame.getContentPane().add(textoDireccion);
		textoDireccion.setColumns(10);
		
		JLabel lblCodigoDepartamento = new JLabel("codigo departamento");
		lblCodigoDepartamento.setBounds(12, 62, 198, 19);
		frame.getContentPane().add(lblCodigoDepartamento);
		
		JLabel lblNombreDepartamento = new JLabel("nombre departamento");
		lblNombreDepartamento.setBounds(12, 105, 160, 15);
		frame.getContentPane().add(lblNombreDepartamento);
		
		JLabel lblDireccionDepartamento = new JLabel("direccion departamento");
		lblDireccionDepartamento.setBounds(12, 147, 198, 15);
		frame.getContentPane().add(lblDireccionDepartamento);
		
		JButton btnIntroducirDatos = new JButton("introducir datos");
		btnIntroducirDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textoCodigo.getText().equals("") && !textoNombre.getText().equals("") 
						&& !textoDireccion.getText().equals("")) {
				System.out.println("codigo: " + textoCodigo.getText());
				System.out.println("nombre: " +textoNombre.getText());
				System.out.println("direccion: "+textoDireccion.getText());
				}
			}
		});
		btnIntroducirDatos.setBounds(12, 208, 185, 25);
		frame.getContentPane().add(btnIntroducirDatos);
		
		JButton btnLimpiardatos = new JButton("limpiarDatos");
		btnLimpiardatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textoCodigo.setText("");
				textoDireccion.setText("");
				textoNombre.setText("");
			}
		});
		btnLimpiardatos.setBounds(228, 208, 170, 25);
		frame.getContentPane().add(btnLimpiardatos);
	}
}
