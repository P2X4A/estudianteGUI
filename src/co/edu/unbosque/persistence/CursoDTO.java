package co.edu.unbosque.persistence;

public class CursoDTO {
	private String materia;
	private String profesorMateria;
	private int numeroCreditos;

	public CursoDTO(String materia, String profesorMateria, int numeroCreditos) {
		this.materia = materia;
		this.profesorMateria = profesorMateria;
		this.numeroCreditos = numeroCreditos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getProfesorMateria() {
		return profesorMateria;
	}

	public void setProfesorMateria(String profesorMateria) {
		this.profesorMateria = profesorMateria;
	}

	public int getNumeroCreditos() {
		return numeroCreditos;
	}

	public void setNumeroCreditos(int numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

}
