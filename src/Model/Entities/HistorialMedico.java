package Model.Entities;

import java.util.ArrayList;

public class HistorialMedico {
    private ArrayList<EntradaHistorial> entradas;

    public HistorialMedico(ArrayList<EntradaHistorial> entradas) {
        this.entradas = entradas;
    }

    public void agregarEntrada(EntradaHistorial entrada){
        entradas.add(entrada);
    }

    @Override
    public String toString() {
        return "1. Receta: " + entradas.getFirst() + '\n' +
               "2. Prueba Medica: " + entradas.getLast();

    }
}
