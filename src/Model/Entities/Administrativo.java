package Model.Entities;

public class Administrativo extends Usuario {
    private String idAdministrativo;

    public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdministrativo) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.idAdministrativo = idAdministrativo;
    }

    public String getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public void agregarMedico(Paciente paciente, Medico medico) {
        paciente.setMedicoAsignado(medico);
    }

    public void asignarPrueba(Paciente paciente, PruebaMedica prueba) {
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "idAdministrativo='" + idAdministrativo + '\'' +
                '}';
    }
}
