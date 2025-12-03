package Model.Entities;

import Model.Enum.Especialidad;

public class Medico extends PersonalSanitario {
    private Especialidad especialidad;

    public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, Especialidad especialidad) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

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
