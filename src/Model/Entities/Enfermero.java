package Model.Entities;

import Model.Enum.EspecialidadEnfermero;

public class Enfermero extends PersonalSanitario {

    private EspecialidadEnfermero especialidad;

    public Enfermero(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, EspecialidadEnfermero especialidad ) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
        this.especialidad = especialidad;
    }

    public EspecialidadEnfermero getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadEnfermero especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public String toString() {
        return "Enfermero{" +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                "especialidad=" + especialidad +
                ", numeroColegiado='" + numeroColegiado + '\'' +
                '}';
    }
}
