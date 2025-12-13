package Model.Entities;

/**
 * Clase que representa un paciente en el sistema médico.
 * Extiende de Persona y contiene información médica específica.
 *
 * @author SecMecProject
 * @version 1.0
 */
public class Paciente extends Persona {
    /** Historial médico del paciente */
    private HistorialMedico historial;
    /** Médico asignado al paciente */
    private Medico medicoAsignado;

    /**
     * Constructor de la clase Paciente.
     *
     * @param nombre Nombre completo del paciente
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico
     * @param direccion Dirección física
     * @param historial Historial médico del paciente
     * @param medicoAsignado Médico asignado al paciente
     */
    public Paciente(String nombre, String dni, String email, String direccion, HistorialMedico historial, Medico medicoAsignado) {
        super(nombre, dni, email, direccion);
        this.historial = historial;
        this.medicoAsignado = medicoAsignado;
    }

    /**
     * Obtiene el historial médico del paciente.
     *
     * @return El historial médico
     */
    public HistorialMedico getHistorial() {
        return historial;
    }

    /**
     * Establece el historial médico del paciente.
     *
     * @param historial El nuevo historial médico
     */
    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    /**
     * Obtiene el médico asignado al paciente.
     *
     * @return El médico asignado
     */
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    /**
     * Establece el médico asignado al paciente.
     *
     * @param medicoAsignado El nuevo médico asignado
     */
    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    /**
     * Devuelve una representación en String del paciente.
     * Incluye información detallada del paciente, historial y médico asignado.
     *
     * @return String con los datos del paciente
     */
    @Override
    public String toString() {
        return "Paciente:\n" +
                "-Nombre= " + nombre + '\n' +
                "-Direccion= " + direccion + '\n' +
                "-email= " + email + '\n' +
                "-Dni= " + dni + '\n'+
                "-Historial= \n" + historial + '\n' +
                "-MedicoAsignado= " + medicoAsignado.getNombre() +'\n';
    }
}
