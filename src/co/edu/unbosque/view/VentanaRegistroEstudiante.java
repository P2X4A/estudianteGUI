package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.util.Constant;

public class VentanaRegistroEstudiante extends JDialog {
    private JLabel lblNombre, lblCorreo, lblPrograma, lblFacultad, lblCelular;
    private JTextField txtNombre, txtCorreo, txtCelular;
    private JComboBox<String> comboPrograma, comboFacultad;
    private JButton btnGuardar, btnCancelar;
    private JPanel panelFormulario;

    public VentanaRegistroEstudiante(JFrame owner, ActionListener listener) {
        super(owner, true);
        setTitle("Registrar Nuevo Estudiante");
        setLayout(new BorderLayout());
        initComponents(listener);
        add(panelFormulario, BorderLayout.CENTER);
        setSize(400, 350);
        setLocationRelativeTo(owner);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponents(ActionListener listener) {
        panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(6, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        lblNombre = new JLabel("Nombre:");
        lblCorreo = new JLabel("Correo:");
        lblPrograma = new JLabel("Programa:");
        lblFacultad = new JLabel("Facultad:");
        lblCelular = new JLabel("Celular:");

        txtNombre = new JTextField();
        txtCorreo = new JTextField();
        txtCelular = new JTextField();

        String[] facultades = { "Seleccione...", "Medicina", "Ingeniería", "Derecho", "Administración" };
        String[] programas = { "Seleccione...", "Ing. Sistemas", "Medicina", "Derecho", "Administración de Empresas" };

        comboFacultad = new JComboBox<>(facultades);
        comboPrograma = new JComboBox<>(programas);

        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");

        btnGuardar.setActionCommand(Constant.GUARDAR_ESTUDIANTE);
        btnCancelar.setActionCommand(Constant.CANCELAR_ESTUDIANTE);

        btnGuardar.addActionListener(listener);
        btnCancelar.addActionListener(listener);

        lblNombre.setLabelFor(txtNombre);
        lblCorreo.setLabelFor(txtCorreo);
        lblCelular.setLabelFor(txtCelular);
        lblPrograma.setLabelFor(comboPrograma);
        lblFacultad.setLabelFor(comboFacultad);

        panelFormulario.add(lblNombre);
        panelFormulario.add(txtNombre);
        panelFormulario.add(lblCorreo);
        panelFormulario.add(txtCorreo);
        panelFormulario.add(lblCelular);
        panelFormulario.add(txtCelular);
        panelFormulario.add(lblFacultad);
        panelFormulario.add(comboFacultad);
        panelFormulario.add(lblPrograma);
        panelFormulario.add(comboPrograma);
        panelFormulario.add(btnCancelar);
        panelFormulario.add(btnGuardar);
    }

    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public String getCorreo() {
        return txtCorreo.getText().trim();
    }

    public String getCelular() {
        return txtCelular.getText().trim();
    }

    public String getPrograma() {
        return (String) comboPrograma.getSelectedItem();
    }

    public String getFacultad() {
        return (String) comboFacultad.getSelectedItem();
    }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtCorreo.setText("");
        txtCelular.setText("");
        comboPrograma.setSelectedIndex(0);
        comboFacultad.setSelectedIndex(0);
        txtNombre.requestFocus();
    }

    public void mostrarVentana() {
        setVisible(true);
    }

    public void cerrarVentana() {
        dispose();
    }

    // Métodos para mostrar mensajes al usuario
    
    public void mostrarAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    public void mostrarInfo(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public int mostrarConfirmacion(String mensaje) {
        return JOptionPane.showConfirmDialog(this, mensaje, "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}
