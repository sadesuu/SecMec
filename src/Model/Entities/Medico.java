package Model.Entities;

import Model.Enum.Especialidad;

/**
 * Clase que representa un médico en el sistema.
 * Extiende de PersonalSanitario y añade información de especialización.
 *
 * @author SecMecProject
 * @version 1.0
 */
public class Medico extends PersonalSanitario {
    /** Especialidad médica del médico */
    private Especialidad especialidad;

    /**
     * Constructor de la clase Medico.
     *
     * @param nombre Nombre completo del médico
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico
     * @param direccion Dirección física
     * @param username Nombre de usuario
     * @param passwordHash Hash de la contraseña
     * @param salt Salt para el hash
     * @param numeroColegiado Número de colegiado profesional
     * @param especialidad Especialidad médica
     */
    public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, Especialidad especialidad) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la especialidad del médico.
     *
     * @return La especialidad médica
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del médico.
     *
     * @param especialidad La nueva especialidad
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Devuelve una representación en String del médico.
     * Incluye información detallada del médico y su especialidad.
     *
     * @return String con los datos del médico
     */
    @Override
    public String toString() {
        return "Medico:\n" +
                "- Especialidad= " + especialidad + '\n' +
                "- Nombre='" + nombre + '\n' +
                "- Direccion='" + direccion + '\n' +
                "- email='" + email + '\'' +
                "- Dni='" + dni + '\n' +
                "- NumeroColegiado='" + numeroColegiado + '\n';
    }
}
