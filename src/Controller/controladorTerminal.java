package Controller;

import Model.Entities.*;
import Model.Enum.*;
import View.vistaTerminal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Controlador principal de la aplicación para la interfaz de terminal.
 * Gestiona la lógica de negocio y la comunicación entre modelo y vista.
 *
 * @author SecMecProject
 * @version 1.0
 */
public class controladorTerminal {

    /**
     * Método público de inicio de la aplicación.
     * Llama al método main interno.
     */
    public static void run() {
        main();
    }

    /**
     * Método principal que inicializa y ejecuta la aplicación.
     * Crea datos de prueba y muestra información en la terminal.
     */
    static void main() {

        /*
        // Crear instancia de la vista
        vistaTerminal v = new vistaTerminal();

        // Crear datos de prueba
        Receta receta = new Receta(LocalDate.now(), "MED123", "Dolor de cabeza", new ArrayList<String>() {{add("Paracetamol 500mg");add("Ibuprofeno 200mg");}});
        PruebaMedica prueba = new PruebaMedica(LocalDate.now(), "MED123", "Chequeo general", Model.Enum.TipoPrueba.SANGRE, "Normal") {};

        Medico medico = new Medico("Wassim", "50487202V" , "Cardiologo", "555-1234", "wassimdoc", "hashedpassword", "randomsalt", "MED123", Especialidad.CARDIOLOGIA);
        Paciente paciente  = new Paciente( "Juan Perez", "12345678A", "hsolistorrijos@gmail.com", "Calle Falsa 123", historiarPaciente1, medico);
        Administrativo administrativo = new Administrativo("Ana Gomez", "87654321B", "ana.admin", "hashedpassword", "randomsalt", "ADM456", "Recepcionista", "1");

    
        // Agregar entradas al historial medico del paciente
        historiarPaciente1.agregarEntrada(receta);
        historiarPaciente1.agregarEntrada(prueba);



        // Mostrar informacion en la terminal
        System.out.println(v.vistaTerminal(paciente.toString()));
        System.out.println(v.vistaTerminal(medico.toString()));
        System.out.println(v.vistaTerminal(administrativo.toString()));*/




        //Clase vista
        vistaTerminal v = new vistaTerminal();

        // Crear Médicos
            Medico medicoA = new Medico("Dr. House", "11111111H", "house@hospital.com", "Calle 1", "house", "pass", "salt", "MED-A", Especialidad.NEUROLOGIA);
            Medico medicoB = new Medico("Dra. Grey", "22222222G", "grey@hospital.com", "Calle 2", "grey", "pass", "salt", "MED-B", Especialidad.NEUROLOGIA);

        // Crear Paciente
            Paciente paciente = new Paciente("Juan Perez", "12345678Z", "juan@email.com", "Calle Real 10", new HistorialMedico(new ArrayList<>()), medicoA);

        // Crear Recetas y Pruebas
        // Recetas del Médico A
            Receta receta1 = new Receta(LocalDate.now().minusDays(10), medicoA.getUsername(),"Mareos", new ArrayList<String>( Arrays.asList("Paracetamol 600", "Ibuprofeno 400")));
            Receta receta2 = new Receta(LocalDate.now(), medicoA.getUsername(), "Insomnio", new ArrayList<String>( Arrays.asList("Melatonina 5mg")));

        // Receta del Médico B
            Receta receta3 = new Receta(LocalDate.now().minusDays(5), medicoB.getUsername(),  "Cefaleas", new ArrayList<String>( Arrays.asList("Aspirina 500mg")));

        // Prueba Médica (para verificar que NO se incluye)
            PruebaMedica prueba = new PruebaMedica(LocalDate.now().minusDays(3), medicoA.getUsername(), "Chequeo general", TipoPrueba.SANGRE, "Normal") {};
        // Añadir todo al historial del paciente
            paciente.getHistorial().agregarEntrada(receta1);
            paciente.getHistorial().agregarEntrada(receta3);
            paciente.getHistorial().agregarEntrada(prueba);
            paciente.getHistorial().agregarEntrada(receta2);


        System.out.println("Ejercicio 1");
        System.out.println("----------------------");
        // Obtener recetas del Médico A
            ArrayList<Receta> recetasMedicoA = (ArrayList<Receta>)
            paciente.getHistorial().obtenerRecetasPorMedico(paciente, medicoA.getUsername());
        // Mostrar recetas del Médico A
            System.out.println("Recetas del " + medicoA.getNombre() + ":");
            for (Receta recetas : recetasMedicoA) {
                v.vistaTerminal(recetas);
            }
        //Obtener recetas del Medico B
            ArrayList<Receta> recetasMedicoB = (ArrayList<Receta>)
            paciente.getHistorial().obtenerRecetasPorMedico(paciente, medicoB.getUsername());
        //Mostrar recetas del Médico B
            System.out.println();
            System.out.println("Recetas del " + medicoB.getNombre() + ":");
            for (Receta recetas : recetasMedicoB) {
                v.vistaTerminal(recetas);
            }


        System.out.println();
        System.out.println("Ejercicio 2");
        System.out.println("----------------------");

        Enfermero enfermero1 = new Enfermero("Dr. House", "11111111H", "house@hospital.com", "Calle 1", "house", "pass", "salt", "MED-A", EspecialidadEnfermero.GENERALISTA);
        Enfermero enfermero2 = new Enfermero("Dra. Grey", "22222222G", "grey@hospital.com", "Calle 2", "grey", "pass", "salt", "MED-B", EspecialidadEnfermero.PEDIATRICO);

        v.vistaTerminal(enfermero1.toString());
        v.vistaTerminal(enfermero2.toString());

        v.vistaTerminal(enfermero1.getUsername());
        v.vistaTerminal(enfermero2.getUsername());

        System.out.println();
        System.out.println("Ejercicio 3");
        System.out.println("----------------------");

        Analisis analisis1 = new Analisis(LocalDate.now().minusDays(5), medicoA.getNombre(), "Intoxicación", tipoAnalisis.SANGRE, estado.EN_PROCESO);
        Analisis analisis2 = new Analisis(LocalDate.now().minusDays(10), medicoB.getNombre(), "Piedras en el riñón", tipoAnalisis.ORINA, estado.COMPLETADO);
        paciente.getHistorial().agregarEntrada(analisis1);
        paciente.getHistorial().agregarEntrada(analisis2);
        v.vistaTerminal(paciente.getHistorial());
        v.vistaTerminal(analisis1.toString());
        v.vistaTerminal(analisis1.getTipoAnalisis());
        v.vistaTerminal(analisis1.getEstado());



        System.out.println();
        System.out.println("Ejercicio 4");
        System.out.println("----------------------");


        //Obtener análisis del Médico B
        ArrayList<Analisis> analisisMedicoB = (ArrayList<Analisis>)
                paciente.getHistorial().obtenerAnalisis(paciente);
        //Mostrar análisis del Médico B
        System.out.println();
        System.out.println("Análisis del " + medicoB.getNombre() + ":");
        for (Analisis analisis : analisisMedicoB) {
            v.vistaTerminal(analisis);
        }


    }
}
