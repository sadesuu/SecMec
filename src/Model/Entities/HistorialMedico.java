package Model.Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase que representa el historial médico de un paciente.
 * Contiene todas las entradas médicas (recetas, pruebas, etc.).
 *
 * @author SecMecProject
 * @version 1.0
 */
public class HistorialMedico {
    /**
     * Lista de entradas del historial médico
     */
    private ArrayList<EntradaHistorial> entradas;

    /**
     * Constructor de la clase HistorialMedico.
     *
     * @param entradas Lista inicial de entradas del historial
     */
    public HistorialMedico(ArrayList<EntradaHistorial> entradas) {
        this.entradas = entradas;
    }

    /**
     * Agrega una nueva entrada al historial médico.
     *
     * @param entrada La entrada a agregar al historial
     */
    public void agregarEntrada(EntradaHistorial entrada) {
        entradas.add(entrada);
    }

    public List<Receta> obtenerRecetasPorMedico(Paciente paciente, String idMedicoBuscado) {
        List<Receta> recetas = new ArrayList<>();
        for (EntradaHistorial entrada : paciente.getHistorial().entradas) {
            if (idMedicoBuscado.equals(entrada.getIdMedico())) {
                if (entrada.getTipo().equals("Receta")) {
                    recetas.add((Receta) entrada);
                }
            }
        }
        return recetas;
    }

    public List<Analisis> obtenerAnalisis(Paciente paciente) {
        List<Analisis> analisisList = new ArrayList<>();
        for (EntradaHistorial entrada : paciente.getHistorial().entradas) {

                if (entrada.getTipo().equals("Analisis")) {
                    analisisList.add((Analisis) entrada);

            }
        }
        return analisisList;
    }

        /**
         * Devuelve una representación en String del historial médico.
         * Muestra las entradas del historial.
         *
         * @return String con las entradas del historial
         */
    @Override
    public String toString() {
        return "HistorialMedico: \n" + Arrays.toString(entradas.toArray()) ;

    }
}

