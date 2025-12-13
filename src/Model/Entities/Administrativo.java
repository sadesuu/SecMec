package Model.Entities;

/**
 * Clase que representa un usuario administrativo del sistema médico.
 * Extiende de Usuario y tiene permisos para gestionar médicos y pruebas.
 *
 * @author SecMecProject
 * @version 1.0
 */
public class Administrativo extends Usuario {
    /** Identificador único del administrativo */
    private String idAdministrativo;

    /**
     * Constructor de la clase Administrativo.
     *
     * @param nombre Nombre completo del administrativo
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico
     * @param direccion Dirección física
     * @param username Nombre de usuario
     * @param passwordHash Hash de la contraseña
     * @param salt Salt para el hash
     * @param idAdministrativo Identificador del administrativo
     */
    public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdministrativo) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.idAdministrativo = idAdministrativo;
    }

    /**
     * Obtiene el identificador del administrativo.
     *
     * @return El ID del administrativo
     */
    public String getIdAdministrativo() {
        return idAdministrativo;
    }

    /**
     * Establece el identificador del administrativo.
     *
     * @param idAdministrativo El nuevo ID
     */
    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    /**
     * Asigna un médico a un paciente.
     *
     * @param paciente El paciente al que se asignará el médico
     * @param medico El médico a asignar
     */
    public void agregarMedico(Paciente paciente, Medico medico) {
        paciente.setMedicoAsignado(medico);
    }

    /**
     * Asigna una prueba médica a un paciente.
     *
     * @param paciente El paciente al que se asignará la prueba
     * @param prueba La prueba médica a asignar
     */
    public void asignarPrueba(Paciente paciente, PruebaMedica prueba) {
    }

    /**
     * Devuelve una representación en String del administrativo.
     * Incluye información detallada del administrativo.
     *
     * @return String con los datos del administrativo
     */
    @Override
    public String toString() {
        return "Administrativo:\n" +
                "-idAdministrativo= " + idAdministrativo + '\n' +
                "-Nombre= " + nombre + '\n' +
                "-Direccion= " + direccion + '\n' +
                "-email= " + email + '\n' +
                "-Dni= " + dni + '\n';

    }
}
