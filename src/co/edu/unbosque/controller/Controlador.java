package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.util.Constant;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaRegistroEstudiante;
import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.Curso;
import co.edu.unbosque.persistence.EstudianteDTO;
import co.edu.unbosque.persistence.CursoDTO;
import co.edu.unbosque.persistence.DataMapper;

public class Controlador implements ActionListener {

    private VentanaPrincipal vistaPrincipal;
    private VentanaRegistroEstudiante ventanaRegistroEstudiante;

    public void ejecutar() {
        vistaPrincipal = new VentanaPrincipal(this);
        vistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String actionCommand = event.getActionCommand();

        switch (actionCommand) {
            case Constant.ITEM_NUEVO_ESTUDIANTE:
                abrirRegistroEstudiante();
                break;

            case Constant.GUARDAR_ESTUDIANTE:
                guardarEstudiante();
                break;

            case Constant.CANCELAR_ESTUDIANTE:
                cancelarEstudiante();
                break;

            
            default:
                System.out.println("Comando no reconocido: " + actionCommand);
        }
    }

    private void abrirRegistroEstudiante() {
        if (ventanaRegistroEstudiante == null) {
            ventanaRegistroEstudiante = new VentanaRegistroEstudiante(vistaPrincipal, this);
        }
        ventanaRegistroEstudiante.limpiarCampos();
        ventanaRegistroEstudiante.mostrarVentana();
    }

    private void guardarEstudiante() {
        if (ventanaRegistroEstudiante == null) return;

        // 1. Tomar info de la vista
        String nombre = ventanaRegistroEstudiante.getNombre();
        String correo = ventanaRegistroEstudiante.getCorreo();
        String celular = ventanaRegistroEstudiante.getCelular();
        String programa = ventanaRegistroEstudiante.getPrograma();
        String facultad = ventanaRegistroEstudiante.getFacultad();

        // 2. Validar datos (cuadro de advertencia por vista)
        if (!validarDatosEstudiante(nombre, correo, celular, programa, facultad)) {
            return;
        }

        // 3. Crear DTO
        EstudianteDTO dto = new EstudianteDTO(nombre, correo, facultad, celular);


        // 4. Convertir DTO a entidad
        Estudiante entidad = deDTOAEntidadEstudiante(dto);


        // 5. Mensaje de éxito (por vista)
        ventanaRegistroEstudiante.mostrarInfo("Estudiante registrado exitosamente");
        ventanaRegistroEstudiante.cerrarVentana();
        ventanaRegistroEstudiante = null;
    }

    private boolean validarDatosEstudiante(String nombre, String correo, String celular,
                                           String programa, String facultad) {
        if (nombre.isEmpty()) {
            ventanaRegistroEstudiante.mostrarAdvertencia("El campo Nombre es obligatorio");
            return false;
        }
        if (correo.isEmpty()) {
            ventanaRegistroEstudiante.mostrarAdvertencia("El campo Correo es obligatorio");
            return false;
        }
        if (celular.isEmpty()) {
            ventanaRegistroEstudiante.mostrarAdvertencia("El campo Celular es obligatorio");
            return false;
        }
        if (programa.equals("Seleccione...")) {
            ventanaRegistroEstudiante.mostrarAdvertencia("Debe seleccionar un Programa");
            return false;
        }
        if (facultad.equals("Seleccione...")) {
            ventanaRegistroEstudiante.mostrarAdvertencia("Debe seleccionar una Facultad");
            return false;
        }
        if (!correo.contains("@") || !correo.contains(".")) {
            ventanaRegistroEstudiante.mostrarAdvertencia("El formato del correo electrónico no es válido");
            return false;
        }
        try {
            Long.parseLong(celular);
        } catch (NumberFormatException e) {
            ventanaRegistroEstudiante.mostrarAdvertencia("El celular debe contener solo números");
            return false;
        }
        return true;
    }

    private void cancelarEstudiante() {
        if (ventanaRegistroEstudiante != null) {
            int respuesta = ventanaRegistroEstudiante.mostrarConfirmacion("¿Está seguro de que desea cancelar el registro?");
            if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
                ventanaRegistroEstudiante.cerrarVentana();
                ventanaRegistroEstudiante = null;
            }
        }
    }

    // === Métodos para conversión DTO <-> Entidad ===

    // 1. Estudiante entidad a DTO
    private EstudianteDTO deEntidadADTOEstudiante(Estudiante e) {
        return DataMapper.deEntidadADTO(e);
    }

    // 2. Estudiante DTO a entidad
    private Estudiante deDTOAEntidadEstudiante(EstudianteDTO dto) {
        return DataMapper.deDTOAEntidad(dto);
    }

    // 3. Curso entidad a DTO
    private CursoDTO deEntidadADTOCurso(Curso c) {
        return DataMapper.deEntidadADTO(c);
    }

    // 4. Curso DTO a entidad
    private Curso deDTOAEntidadCurso(CursoDTO dto) {
        return DataMapper.deDTOAEntidad(dto);
    }
}
