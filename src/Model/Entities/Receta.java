package Model.Entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase que representa una receta médica en el historial.
 * Extiende de EntradaHistorial y contiene medicamentos prescritos.
 *
 * @author SecMecProject
 * @version 1.0
 */
public class Receta extends EntradaHistorial{

    /** Lista de medicamentos prescritos */
    private ArrayList<String> medicamentos;

    /**
     * Constructor de la clase Receta.
     *
     * @param fecha Fecha de la receta
     * @param idMedico ID del médico que prescribe
     * @param causa Causa o diagnóstico
     * @param medicamentos Lista de medicamentos prescritos
     */
    public Receta(LocalDate fecha, String idMedico, String causa, ArrayList<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }

    /**
     * Obtiene la lista de medicamentos prescritos.
     *
     * @return ArrayList con los medicamentos
     */
    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }

    /**
     * Obtiene el tipo de entrada.
     *
     * @return El nombre simple de la clase (Receta)
     */
    public String getTipo(){
        return this.getClass().getSimpleName();
    }

    /**
     * Devuelve una representación en String de la receta.
     * Incluye medicamentos, fecha, médico y causa.
     *
     * @return String con los datos de la receta
     */
    @Override
    public String toString() {
        return "medicamententos= " + medicamentos +
                ", fecha= " + fecha +
                ", idMedico= " + idMedico +
                ", causa='" + causa;
    }
}
