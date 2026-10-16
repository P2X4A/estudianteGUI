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
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.util.Constant;

public class VentanaRegistroCurso extends JDialog {

	private JLabel lblPrograma, lblComboFacultad, lblMateriaCurso, lblMaestroMateria, lblCreditosTotales;
	private JTextField txtMateriaCurso, txtMaestroMateria, txtCreditosTotales;
	private JComboBox<String> comboPrograma, comboFacultad;
	private JButton btnGuardar, btnCancelar;
	private JPanel panelRegistroCurso;

	public VentanaRegistroCurso(JFrame owner, ActionListener actionListener) {
		setTitle("Crear Curso");
		setLayout(new BorderLayout());

		initComponents(actionListener);

		add(panelRegistroCurso, BorderLayout.CENTER);

		setSize(400, 350);
		setLocationRelativeTo(owner);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}

	private void initComponents(ActionListener actionListener) {
		panelRegistroCurso = new JPanel();
		panelRegistroCurso.setLayout(new GridLayout(5, 2, 10, 10));

		panelRegistroCurso.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		// Inicializar labels
		lblPrograma = new JLabel("Programa:");
		lblComboFacultad = new JLabel("Facultad:");
		lblMateriaCurso = new JLabel("Materia:");
		lblMaestroMateria = new JLabel("Maestro Curso:");
		lblCreditosTotales = new JLabel("Creditos Totales:");

		// inicializar Jtxtfields
		txtMateriaCurso = new JTextField();
		txtMaestroMateria = new JTextField();
		txtCreditosTotales = new JTextField();

		// Arreglos ComboBox
		String[] facultades = { "Seleccione:", "Medicina", "Ingeniería", "Derecho", "Administración" };
		String[] programas = { "Seleccione:", "Ing. Sistemas", "Medicina", "Derecho", "Administracion de empresas" };

		comboFacultad = new JComboBox<>(facultades);
		comboPrograma = new JComboBox<>(programas);

		// Inicializar Botones
		btnGuardar = new JButton("Guardar");
		btnCancelar = new JButton("Cancelar");

		// Asignar action commands con constantes
		btnGuardar.setActionCommand(Constant.GUARDAR_CURSO);
		btnCancelar.setActionCommand(Constant.CANCELAR_CURSO);

		// Asignar botones al action listener
		btnGuardar.addActionListener(actionListener);
		btnCancelar.addActionListener(actionListener);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		// Asignar txtFields con JLabel para accesibilidad
		lblMateriaCurso.setLabelFor(txtMateriaCurso);
		lblMaestroMateria.setLabelFor(txtMaestroMateria);
		lblCreditosTotales.setLabelFor(txtCreditosTotales);

		// Agregar componentes al formulario
		panelRegistroCurso.add(lblMateriaCurso);
		panelRegistroCurso.add(txtMateriaCurso);

		panelRegistroCurso.add(lblMaestroMateria);
		panelRegistroCurso.add(txtMaestroMateria);

		panelRegistroCurso.add(lblCreditosTotales);
		panelRegistroCurso.add(txtCreditosTotales);

		panelRegistroCurso.add(lblComboFacultad);
		panelRegistroCurso.add(comboFacultad);

		panelRegistroCurso.add(lblPrograma);
		panelRegistroCurso.add(comboPrograma);

	}

	public void limpiarCampos() {
		txtMateriaCurso.setText("");
		txtMaestroMateria.setText("");
		txtCreditosTotales.setText("");
		comboFacultad.setSelectedIndex(0);
		comboPrograma.setSelectedIndex(0);
		txtMateriaCurso.requestFocus();

	}

	//Mostrar / Cerrar
	public void mostrarVentana() {
		setVisible(true);
	}

	public void cerrarVentana() {
		dispose();
	}

	//Obtener informacion cajas de texto
	public String getMateria() {
		return txtMateriaCurso.getText().trim();
	}

	public String getMaestro() {
		return txtMaestroMateria.getText().trim();
	}

	public String getCreditos() {
		return txtCreditosTotales.getText().trim();
	}

	public String getPrograma() {
		return (String) comboPrograma.getSelectedItem();
	}

	public String getFacultad() {
		return (String) comboFacultad.getSelectedItem();
	}

}
