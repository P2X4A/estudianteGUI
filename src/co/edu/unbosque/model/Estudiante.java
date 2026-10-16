package co.edu.unbosque.model;

public class Estudiante {
	private String nombreEstudiante;
	private String correoEstudiante;
	private String facultad;
	private String celular;

	public Estudiante(String nombreEstudiante, String correoEstudiante, String facultad, String celular) {

		this.nombreEstudiante = nombreEstudiante;
		this.correoEstudiante = correoEstudiante;
		this.facultad = facultad;
		this.celular = celular;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getCorreoEstudiante() {
		return correoEstudiante;
	}

	public void setCorreoEstudiante(String correoEstudiante) {
		this.correoEstudiante = correoEstudiante;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String informacionEstudiante() {
	    return "Nombre Estudiante: " + nombreEstudiante + ";" + 
	           "Correo Estudiante: " + correoEstudiante + ";" + 
	           "Facultad Estudiante: " + facultad + ";" +  // ✅ Agregado ":"
	           "Celular Estudiante: " + celular; // ✅ Agregado ":"
	}

}
