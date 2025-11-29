package Model.Entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Receta extends EntradaHistorial{

    private ArrayList<String> medicamente;

    public Receta(LocalDate fecha, String idMedico, String causa, ArrayList<String> medicamente) {
        super(fecha, idMedico, causa);
        this.medicamente = medicamente;
    }

    public ArrayList<String> getMedicamente() {
        return medicamente;
    }

    public String getTipo(){
    }

    @Override
    public String toString() {
        return "Receta{" +
                "medicamente=" + medicamente +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                '}';
    }
}
