# SecMec

**SecMec** es un sistema de gestión médica desarrollado en Java que implementa una arquitectura MVC (Modelo-Vista-Controlador). El proyecto permite administrar información de pacientes, médicos y personal administrativo, incluyendo la gestión de historiales médicos, recetas, pruebas médicas y citas. Está diseñado para facilitar la organización y el seguimiento de datos clínicos de forma estructurada y segura.

## Requisitos
- JDK 11+ (si el proyecto es Java) o el runtime/lenguaje apropiado según la implementación.
- IDE recomendado: IntelliJ IDEA, VS Code u otro compatible.
- Herramienta de build: Maven o Gradle (si procede).

## Instalación y ejecución rápida
1. Clona el repositorio:
   ```bash
   git clone https://github.com/sadesuu/SecMec.git
   cd SecMec
   ```

2. Abrir el proyecto en tu IDE (por ejemplo IntelliJ). La configuración del proyecto está en el archivo `SecMec.iml`.

3. Si el proyecto usa Maven:
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="App.Main"
   ```
   Si usa Gradle:
   ```bash
   ./gradlew build
   ./gradlew run
   ```
   Si no hay build script, ejecuta la clase `main` desde el IDE.

## Estructura del proyecto
- src/
  - App/        -> Punto de entrada de la aplicación, utilidades generales.
  - Controller/ -> Lógica de control: recibe peticiones/entradas y coordina Model/View.
  - Model/      -> Modelos de datos y lógica de negocio.
  - View/       -> Presentación o salida (CLI, GUI, APIs, etc).

## Ejemplos

A continuación hay ejemplos de interacción entre capas. Los ejemplos usan pseudocódigo/estilo Java para ilustrar ideas; adáptalos a la implementación real del repo.

### 1) Ejemplo básico: ejecución desde App (punto de entrada)
```java
package App;

import Controller.UserController;

public class Main {
    public static void main(String[] args) {
        run(); // Método que inicia la aplicación
    }
}
```

### 2) Ejemplo Model
```java
package Model.Entities;

public class Usuario extends Persona {
    protected String username;
    protected String passwordHash;
    protected String salt;

    public Usuario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt) {
        super(nombre, dni, email, direccion);
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    // getters y setters
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public String getPasswordHash() {return passwordHash;}
    public void setPasswordHash(String passwordHash) {this.passwordHash = passwordHash;}

    public String getSalt() {return salt;}
    public void setSalt(String salt) {this.salt = salt;}
}
```

### 3) Ejemplo Controller
```java
package Controller;

import Model.Entities.*;
import Model.Enum.Especialidad;
import View.vistaTerminal;

import java.time.LocalDate;
import java.util.ArrayList;

public class controladorTerminal {
    public static void run() {
        main();
    }

    static void main() {
        // Crear instancia de la vista
        vistaTerminal v = new vistaTerminal();

        // Crear datos de prueba
        Receta receta = new Receta(LocalDate.now(), "MED123", "Dolor de cabeza", new ArrayList<String>() {{add("Paracetamol 500mg");add("Ibuprofeno 200mg");}});
        PruebaMedica prueba = new PruebaMedica(LocalDate.now(), "MED123", "Chequeo general", Model.Enum.TipoPrueba.SANGRE, "Normal") {};
        HistorialMedico historiarPaciente1 = new HistorialMedico(new ArrayList<EntradaHistorial>());
        Medico medico = new Medico("Wassim", "50487202V" , "Cardiologo", "555-1234", "wassimdoc", "hashedpassword", "randomsalt", "MED123", Especialidad.CARDIOLOGIA);
        Paciente paciente  = new Paciente( "Juan Perez", "12345678A", "hsolistorrijos@gmail.com", "Calle Falsa 123", historiarPaciente1, medico);
        Administrativo administrativo = new Administrativo("Ana Gomez", "87654321B", "ana.admin", "hashedpassword", "randomsalt", "ADM456", "Recepcionista", "1");

    
        // Agregar entradas al historial medico del paciente
        historiarPaciente1.agregarEntrada(receta);
        historiarPaciente1.agregarEntrada(prueba);



        // Mostrar informacion en la terminal
        System.out.println(v.vistaTerminal(paciente.toString()));
        System.out.println(v.vistaTerminal(medico.toString()));
        System.out.println(v.vistaTerminal(administrativo.toString()));



    }
}
```

### 4) Ejemplo View
```java
package View;

public class vistaTerminal {
    public String vistaTerminal(String string) {return string;}
}
```

### 5) Ejemplo de prueba rápida (CLI)
1. Ejecuta `App.Main`.
2. Deberías ver en la consola la salida con los detalles del usuario simulados por el Controller y renderizados por la View.

## Buenas prácticas recomendadas
- Mantén la lógica de negocio en `Model` y la interfaz/IO en `View`.
- Los `Controller` deben coordinar acciones y no contener demasiada lógica de negocio.
- Añade pruebas unitarias por cada paquete (`src/test`) para Model y Controller.
- Documenta las API públicas y los contratos de las clases (JavaDoc o comentarios).

## Contribuir
1. Haz un fork del repositorio.
2. Crea un branch con la feature/bugfix: `git checkout -b feature/nombre`.
3. Haz commits claros y descriptivos.
4. Abre un Pull Request describiendo los cambios.
 
