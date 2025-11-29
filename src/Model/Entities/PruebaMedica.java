package Model.Entities;

import Model.Enum.TipoPrueba;

import java.time.LocalDate;

public abstract class PruebaMedica extends EntradaHistorial {
    private TipoPrueba tipoPrueba;
    private String resultado;

    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado) {
        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }

    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(TipoPrueba tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "PruebaMedica{" +
                "tipoPrueba=" + tipoPrueba +
                ", resultado='" + resultado + '\'' +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                '}';
    }


}
