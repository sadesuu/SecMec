package Model.Entities;

public abstract class PersonalSanitario extends Usuario {
    protected String numeroColegiado;

    public PersonalSanitario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.numeroColegiado = numeroColegiado;
    }

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
}
