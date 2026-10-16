package co.edu.unbosque.persistence;

import java.io.IOException;

import co.edu.unbosque.model.Estudiante;

public class EstudianteIdaoImpl implements IDAO <Estudiante>{

	@Override
	public void guardar(Estudiante entidad) throws IOException {
		String informacionArchivoPlanoEstudiante = entidad.informacionEstudiante();
		String nombreArchivoPlanoEstudiante = "estudiante.txt";
		FileHandler.guardarArchivoPlanoEstudiante(nombreArchivoPlanoEstudiante, informacionArchivoPlanoEstudiante);
		
	}

	@Override
	public Estudiante leer(String id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
