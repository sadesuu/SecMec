package Controller;

import Model.Entities.*;
import Model.Enum.Especialidad;
import View.vistaTerminal;

import java.time.LocalDate;
import java.util.ArrayList;

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
