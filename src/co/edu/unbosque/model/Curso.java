package co.edu.unbosque.model;

public class Curso {
	private String materia;
	private String profesorMateria;
	private int numeroCreditos;

	public Curso(String materia, String profesorMateria, int numeroCreditos) {
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

	public String informacionArchivoPlanoCurso() {
	    return "Materia: " + materia + ";" + 
	           "Profesor Materia: " + profesorMateria + ";" + 
	           "Numero De Creditos: " + numeroCreditos;
	}

}
