package Model.Entities;

import java.util.ArrayList;

/**
 * Clase que representa el historial médico de un paciente.
 * Contiene todas las entradas médicas (recetas, pruebas, etc.).
 *
 * @author SecMecProject
 * @version 1.0
 */
public class HistorialMedico {
    /** Lista de entradas del historial médico */
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
    public void agregarEntrada(EntradaHistorial entrada){
        entradas.add(entrada);
    }

    /**
     * Devuelve una representación en String del historial médico.
     * Muestra las entradas del historial.
     *
     * @return String con las entradas del historial
     */
    @Override
    public String toString() {
        return "1. Receta: " + entradas.getFirst() + '\n' +
               "2. Prueba Medica: " + entradas.getLast();

    }
}
