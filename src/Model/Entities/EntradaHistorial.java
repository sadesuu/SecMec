package Model.Entities;

import java.time.LocalDate;

/**
 * Clase abstracta que representa una entrada en el historial médico.
 * Base para recetas, pruebas médicas y otros registros.
 *
 * @author SecMecProject
 * @version 1.0
 */
public abstract class EntradaHistorial {
    /** Fecha de la entrada */
    protected LocalDate fecha;
    /** Identificador del médico que creó la entrada */
    protected String idMedico;
    /** Causa o motivo de la entrada */
    protected String causa;

    /**
     * Constructor de la clase EntradaHistorial.
     *
     * @param fecha Fecha de la entrada
     * @param idMedico ID del médico responsable
     * @param causa Causa o motivo de la entrada
     */
    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
        this.fecha = fecha;
        this.idMedico = idMedico;
        this.causa = causa;
    }

    /**
     * Obtiene la fecha de la entrada.
     *
     * @return La fecha de la entrada
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene el ID del médico.
     *
     * @return El identificador del médico
     */
    public String getIdMedico() {
        return idMedico;
    }

    /**
     * Obtiene la causa de la entrada.
     *
     * @return La causa o motivo
     */
    public String getCausa() {
        return causa;
    }

    /**
     * Obtiene el tipo de entrada utilizando reflection.
     *
     * @return El nombre de la clase hija
     */
    public String getTipo(){
        return this.getClass().getSimpleName();
    }
}
