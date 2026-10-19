# ðŸ‘¨â€ðŸŽ“ Registro de Estudiantes y Cursos

AplicaciÃ³n grÃ¡fica para registrar estudiantes y cursos con validaciÃ³n de datos y persistencia, desarrollada en Java con **Swing** y arquitectura **MVC**.

## ðŸ“‹ CaracterÃ­sticas

- Registro de estudiantes con validaciÃ³n de campos
- Registro de cursos asociados a estudiantes
- Persistencia de datos en archivo plano mediante `FileHandler`
- Arquitectura MVC con separaciÃ³n clara de responsabilidades
- Panel de datos reutilizable (`PanelDatoRegistro`)
- Interfaz grÃ¡fica Swing con mÃºltiples ventanas

## ðŸ› ï¸ TecnologÃ­as

- Java + Swing
- Maven
- PatrÃ³n MVC
- PatrÃ³n DAO / DTO

## ðŸš€ CÃ³mo ejecutar

```bash
git clone https://github.com/P2X4A/estudianteGUI.git
cd estudianteGUI
mvn clean compile
mvn exec:java -Dexec.mainClass="AplMain"
```

## ðŸ“ Estructura

```
estudianteGUI/
â”œâ”€â”€ pom.xml
â”œâ”€â”€ README.md
â”œâ”€â”€ LICENSE
â”œâ”€â”€ src/
â”‚   â”œâ”€â”€ AplMain.java
â”‚   â”œâ”€â”€ Controlador.java
â”‚   â”œâ”€â”€ Estudiante.java, Curso.java
â”‚   â”œâ”€â”€ EstudianteDTO.java, CursoDTO.java
â”‚   â”œâ”€â”€ EstudianteIdaoImpl.java, CursoIdaoImpl.java
â”‚   â”œâ”€â”€ IDAO.java, DataMapper.java
â”‚   â”œâ”€â”€ FileHandler.java
â”‚   â”œâ”€â”€ VentanaPrincipal.java
â”‚   â”œâ”€â”€ VentanaRegistroEstudiante.java
â”‚   â”œâ”€â”€ VentanaRegistroCurso.java
â”‚   â””â”€â”€ PanelDatoRegistro.java
â””â”€â”€ ...
```

## ðŸ‘¨â€ðŸ’» Autor

Sergio Parra

---

*Proyecto acadÃ©mico para portafolio.*
