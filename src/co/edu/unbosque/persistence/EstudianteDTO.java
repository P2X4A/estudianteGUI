package co.edu.unbosque.persistence;

public class EstudianteDTO {
	private String nombreEstudiante;
	private String correoEstudiante;
	private String facultad;
	private String celular;

	public EstudianteDTO(String nombreEstudiante, String correoEstudiante, String facultad, String celular) {
		this.nombreEstudiante = nombreEstudiante;
		this.correoEstudiante = correoEstudiante;
		this.facultad = facultad;
		this.celular = celular;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public String getCorreoEstudiante() {
		return correoEstudiante;
	}

	public String getFacultad() {
		return facultad;
	}

	public String getCelular() {
		return celular;
	}

}
