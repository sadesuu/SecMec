package Model.Entities;

/**
 * Clase abstracta que representa una persona en el sistema médico.
 * Contiene los datos básicos de identificación y contacto.
 *
 * @author SecMecProject
 * @version 1.0
 */
public abstract class Persona {
    /** Nombre completo de la persona */
    protected String nombre;
    /** Documento Nacional de Identidad */
    protected String dni;
    /** Correo electrónico de contacto */
    protected String email;
    /** Dirección física de residencia */
    protected String direccion;

    /**
     * Constructor de la clase Persona.
     *
     * @param nombre Nombre completo de la persona
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico de contacto
     * @param direccion Dirección física de residencia
     */
    public Persona(String nombre, String dni, String email, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre completo de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI de la persona.
     *
     * @return El Documento Nacional de Identidad
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI de la persona.
     *
     * @param dni El nuevo DNI
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el email de la persona.
     *
     * @return El correo electrónico
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email de la persona.
     *
     * @param email El nuevo correo electrónico
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la dirección de la persona.
     *
     * @return La dirección física de residencia
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección de la persona.
     *
     * @param direccion La nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representación en String de la persona.
     *
     * @return String con los datos de la persona
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
