# Student and Course Registry - estudianteGUI

## Description

Desktop application to register students and courses with field validation and file persistence. Built with a **Swing** interface and an **MVC** architecture; the data layer uses the **DAO** pattern with DTOs, a `DataMapper` and a `FileHandler` over plain text files.

Academic project developed for the **Java programming** courses - Systems Engineering, Universidad El Bosque.

## Author

- Sergio Alejandro Parra Rivera

## Technologies

- Java 21 (compiled with `maven-compiler-plugin`)
- Swing for the graphical interface
- Maven 3.8+ with `exec-maven-plugin` to run the application
- **MVC** architecture (`controller`, `model`, `view`, `persistence`)
- **DAO** and **DTO** patterns for plain text file persistence

## Requirements

| Requirement | Version | How to check |
| --- | --- | --- |
| JDK | 21 or higher | `javac -version` |
| Maven | 3.8 or higher | `mvn -v` |
| Git | Any recent version | `git --version` |

## Installation

Follow these steps exactly so the application runs on the first try.

### 1. Clone the repository

```bash
git clone https://github.com/P2X4A/estudianteGUI.git
```

### 2. Enter the project folder

```bash
cd estudianteGUI
```

> On Windows, if your path contains spaces, always quote it, for example: `cd "C:\Users\Example\Documents\estudianteGUI"`.

### 3. Verify your environment

```bash
javac -version
mvn -v
```

Expected: JDK 21 (or higher) and Maven 3.8 (or higher). If any command fails, install or update that tool before continuing.

### 4. Compile the project

```bash
mvn clean compile
```

What success looks like:

- The console ends with `BUILD SUCCESS`.
- A `target/classes/` folder is created with the compiled classes.

## Running the application

```bash
mvn exec:java
```

The main window opens with options to register students and courses.

Troubleshooting:

- `ClassNotFoundException` or missing main class: compile first with `mvn clean compile`.
- `UnsupportedClassVersionError`: your JDK is older than 21; install JDK 21 or higher and check it with `javac -version`.

## Main features

- **Student registry:** form to register students with field validation before the data is saved.
- **Course registry:** separate window to register courses of the program.
- **Reusable UI components:** `PanelDatoRegistro` centralizes the data form behavior shared by both registration windows.
- **Persistence:** students and courses are stored in plain text files through the DAO layer (`EstudianteIdaoImpl`, `CursoIdaoImpl`) with DTOs, a `DataMapper` and `FileHandler`.

## Project structure

```text
estudianteGUI/
├── pom.xml
├── README.md
├── LICENSE
└── src/
    └── co/edu/unbosque/
        ├── controller/
        │   ├── AplMain.java               # Entry point (main class)
        │   └── Controlador.java           # Application controller (MVC)
        ├── model/
        │   ├── Estudiante.java            # Student entity
        │   └── Curso.java                 # Course entity
        ├── persistence/                   # Data access (DAO pattern)
        │   ├── IDAO.java
        │   ├── EstudianteIdaoImpl.java
        │   ├── CursoIdaoImpl.java
        │   ├── EstudianteDTO.java
        │   ├── CursoDTO.java
        │   ├── DataMapper.java
        │   └── FileHandler.java
        ├── util/
        │   └── Constant.java
        └── view/                          # Swing windows
            ├── VentanaPrincipal.java
            ├── VentanaRegistroEstudiante.java
            ├── VentanaRegistroCurso.java
            └── PanelDatoRegistro.java     # Reusable data panel
```
