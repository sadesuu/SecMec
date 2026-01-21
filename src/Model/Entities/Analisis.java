package Model.Entities;

import Model.Enum.estado;
import Model.Enum.tipoAnalisis;

import java.time.LocalDate;

public class Analisis extends EntradaHistorial{

    private tipoAnalisis tipoAnalisis;
    private estado estado;

    public Analisis(LocalDate fecha, String idMedico, String causa, tipoAnalisis tipoAnalisis, estado estado) {
        super(fecha, idMedico, causa);
        this.tipoAnalisis = tipoAnalisis;
        this.estado = estado;
    }

    public tipoAnalisis getTipoAnalisis() {
        return tipoAnalisis;
    }

    public void setTipoAnalisis(tipoAnalisis tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }

    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Analisis{" +
                "tipoAnalisis=" + tipoAnalisis +
                ", estado=" + estado +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                '}';
    }
}
