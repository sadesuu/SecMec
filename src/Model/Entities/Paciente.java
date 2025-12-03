package Model.Entities;

public class Paciente extends Persona {
    private HistorialMedico historial;
    private Medico medicoAsignado;

    public Paciente(String nombre, String dni, String email, String direccion, HistorialMedico historial, Medico medicoAsignado) {
        super(nombre, dni, email, direccion);
        this.historial = historial;
        this.medicoAsignado = medicoAsignado;
    }

    public HistorialMedico getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

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
