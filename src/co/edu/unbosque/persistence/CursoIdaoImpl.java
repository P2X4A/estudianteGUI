package co.edu.unbosque.persistence;

import java.io.IOException;

import co.edu.unbosque.model.Curso;

public class CursoIdaoImpl implements IDAO <Curso> {

	@Override
	public void guardar(Curso entidad) throws IOException {
		String informacionArchivoPlanoCurso = entidad.informacionArchivoPlanoCurso();
		String nombreArchivoPlanoCurso = "Curso.txt";
		FileHandler.guardarArchivoPlanoCurso(nombreArchivoPlanoCurso, informacionArchivoPlanoCurso);
		
	}

	@Override
	public Curso leer(String id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}


}
