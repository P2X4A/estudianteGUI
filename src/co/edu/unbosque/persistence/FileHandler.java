package co.edu.unbosque.persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {


    public static void guardarArchivoPlanoEstudiante(String nombreArchivoPlanoEstudiante, 
                                                      String informacionArchivoPlanoEstudiante) throws IOException {
        File archivoPlano = new File(nombreArchivoPlanoEstudiante);
        FileWriter archivoEscritor = new FileWriter(archivoPlano, true); 
        BufferedWriter archivoEnMemoria = new BufferedWriter(archivoEscritor);
        archivoEnMemoria.write(informacionArchivoPlanoEstudiante);
        archivoEnMemoria.newLine();
        archivoEnMemoria.flush();
        archivoEnMemoria.close();
        archivoEscritor.close();
    }


    public static void guardarArchivoPlanoCurso(String nombreArchivoPlanoCurso, 
                                                 String informacionArchivoPlanoCurso) throws IOException {
        File archivoPlano = new File(nombreArchivoPlanoCurso);
        FileWriter archivoEscritor = new FileWriter(archivoPlano, true); 
        BufferedWriter archivoEnMemoria = new BufferedWriter(archivoEscritor);
        archivoEnMemoria.write(informacionArchivoPlanoCurso);
        archivoEnMemoria.newLine(); 
        archivoEnMemoria.flush();
        archivoEnMemoria.close();
        archivoEscritor.close();
    }
}
