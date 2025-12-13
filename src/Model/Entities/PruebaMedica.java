package Model.Entities;

import Model.Enum.TipoPrueba;

import java.time.LocalDate;

/**
 * Clase abstracta que representa una prueba médica en el historial.
 * Extiende de EntradaHistorial y contiene información sobre el tipo y resultado.
 *
 * @author SecMecProject
 * @version 1.0
 */
public abstract class PruebaMedica extends EntradaHistorial {
    /** Tipo de prueba médica realizada */
    private TipoPrueba tipoPrueba;
    /** Resultado de la prueba */
    private String resultado;

    /**
     * Constructor de la clase PruebaMedica.
     *
     * @param fecha Fecha de la prueba
     * @param idMedico ID del médico que solicita la prueba
     * @param causa Causa o motivo de la prueba
     * @param tipoPrueba Tipo de prueba médica
     * @param resultado Resultado de la prueba
     */
    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado) {
        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }

    /**
     * Obtiene el tipo de prueba médica.
     *
     * @return El tipo de prueba
     */
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }

    /**
     * Establece el tipo de prueba médica.
     *
     * @param tipoPrueba El nuevo tipo de prueba
     */
    public void setTipoPrueba(TipoPrueba tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    /**
     * Obtiene el resultado de la prueba.
     *
     * @return El resultado de la prueba
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Establece el resultado de la prueba.
     *
     * @param resultado El nuevo resultado
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * Devuelve una representación en String de la prueba médica.
     * Incluye tipo, resultado, fecha, médico y causa.
     *
     * @return String con los datos de la prueba
     */
    @Override
    public String toString() {
        return "tipoPrueba= " + tipoPrueba +
                ", resultado= " + resultado +
                ", fecha= " + fecha +
                ", idMedico= " + idMedico +
                ", causa= " + causa;
    }


}
