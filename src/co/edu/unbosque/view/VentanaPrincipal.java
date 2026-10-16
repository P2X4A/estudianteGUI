package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import co.edu.unbosque.util.Constant;

public class VentanaPrincipal extends JFrame {
    private JMenu menu;
    private JMenuBar menuOpciones;
    private JMenuItem itemsMenuEstudiante, itemsMenuCurso;
    private VentanaRegistroEstudiante ventanaRegistro; // Clase para el registro

    public VentanaPrincipal(ActionListener actionListener) {
        configurarVentana();
        construirBarraMenu(actionListener);
        setVisible(true);
    }
    //Ventana al iniciar el programa
    private void configurarVentana() {
        setSize(800, 600);
        setTitle("Registro Estudiantes");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }
    //Barra del menu para la ventana del programa
    private void construirBarraMenu(ActionListener actionListener) {
        menu = new JMenu("Archivo");
        itemsMenuEstudiante = new JMenuItem("Agregar Estudiante");
        itemsMenuCurso = new JMenuItem("Agregar Curso");
        menuOpciones = new JMenuBar();
        
        // Usar la constante/ Asignar la constante al boton
        itemsMenuEstudiante.setActionCommand(Constant.ITEM_NUEVO_ESTUDIANTE);
        itemsMenuEstudiante.addActionListener(actionListener);
        
        itemsMenuCurso.setActionCommand(Constant.ITEM_NUEVO_CURSO);
        itemsMenuCurso.addActionListener(actionListener);

        menu.add(itemsMenuEstudiante);
        menu.add(itemsMenuCurso);
        menuOpciones.add(menu);
        setJMenuBar(menuOpciones);
    }
    
    // Metodo para mostrar el dialogo de registro
    public void mostrarDialogoRegistro(ActionListener listener) {
        if (ventanaRegistro == null) {
            ventanaRegistro = new VentanaRegistroEstudiante(this, listener);
        }
        ventanaRegistro.mostrarVentana();
    }
    
    // Metodo para cerrar el dialogo
    public void cerrarDialogoRegistro() {
        if (ventanaRegistro != null) {
            ventanaRegistro.cerrarVentana();
        }
    }
}