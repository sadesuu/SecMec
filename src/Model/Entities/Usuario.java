package Model.Entities;

/**
 * Clase que representa un usuario del sistema con credenciales de acceso.
 * Extiende de Persona añadiendo información de autenticación.
 *
 * @author SecMecProject
 * @version 1.0
 */
public class Usuario extends Persona {
    /** Nombre de usuario para el login */
    protected String username;
    /** Hash de la contraseña del usuario */
        protected String passwordHash;
    /** Salt usado para el hash de la contraseña */
    protected String salt;

    /**
     * Constructor de la clase Usuario.
     *
     * @param nombre Nombre completo del usuario
     * @param dni Documento Nacional de Identidad
     * @param email Correo electrónico
     * @param direccion Dirección física
     * @param username Nombre de usuario para login
     * @param passwordHash Hash de la contraseña
     * @param salt Salt para el hash
     */
    public Usuario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt) {
        super(nombre, dni, email, direccion);
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return El username del usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param username El nuevo username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el hash de la contraseña.
     *
     * @return El hash de la contraseña
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Establece el hash de la contraseña.
     *
     * @param passwordHash El nuevo hash de la contraseña
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Obtiene el salt de la contraseña.
     *
     * @return El salt usado en el hash
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Establece el salt de la contraseña.
     *
     * @param salt El nuevo salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * Devuelve una representación en String del usuario.
     *
     * @return String con los datos del usuario
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }

}
