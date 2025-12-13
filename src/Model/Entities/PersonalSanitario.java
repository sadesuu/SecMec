package Model.Entities;

/**
 * Clase abstracta que representa al personal sanitario del sistema.
 * Extiende de Usuario y añade información profesional específica.
 *
 * @author SecMecProject
 * @version 1.0
 */
public abstract class PersonalSanitario extends Usuario {
    /** Número de colegiado del personal sanitario */
    protected String numeroColegiado;

    /**
     * Constructor de la clase PersonalSanitario.
     *
     * @param nombre Nombre completo
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico
     * @param direccion Dirección física
     * @param username Nombre de usuario
     * @param passwordHash Hash de la contraseña
     * @param salt Salt para el hash
     * @param numeroColegiado Número de colegiado profesional
     */
    public PersonalSanitario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.numeroColegiado = numeroColegiado;
    }

    /**
     * Obtiene el número de colegiado.
     *
     * @return El número de colegiado profesional
     */
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    /**
     * Establece el número de colegiado.
     *
     * @param numeroColegiado El nuevo número de colegiado
     */
    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
}
