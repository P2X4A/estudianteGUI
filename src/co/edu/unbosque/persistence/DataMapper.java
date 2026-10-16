package co.edu.unbosque.persistence;

import co.edu.unbosque.model.Curso;
import co.edu.unbosque.model.Estudiante;

public class DataMapper {

	//Pasar de Entidad A DTO
	public static EstudianteDTO deEntidadADTO(Estudiante estudiante) {
		EstudianteDTO dto = new EstudianteDTO(
				estudiante.getNombreEstudiante(),
				estudiante.getCorreoEstudiante(),
				estudiante.getFacultad(),
				estudiante.getCelular()
				);
		return dto;
	}
	
	public static CursoDTO deEntidadADTO(Curso curso) {
		CursoDTO dto = new CursoDTO(
				curso.getMateria(),
				curso.getProfesorMateria(),
				curso.getNumeroCreditos()
				);
		
		return dto;
	}
	//Pasar de DTO a entidad
	
	public static Estudiante deDTOAEntidad(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante(
				estudianteDTO.getNombreEstudiante(),
				estudianteDTO.getCorreoEstudiante(),
				estudianteDTO.getFacultad(),
				estudianteDTO.getCelular()
				);
		return estudiante;
	}
	
	public static Curso deDTOAEntidad(CursoDTO cursoDTO) {
		Curso curso = new Curso(
				cursoDTO.getMateria(),
				cursoDTO.getProfesorMateria(),
				cursoDTO.getNumeroCreditos()
				);
		return curso;
	}
}
