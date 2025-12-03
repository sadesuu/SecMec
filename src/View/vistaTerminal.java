package View;

import Model.Entities.Administrativo;
import Model.Entities.Medico;
import Model.Entities.Paciente;

public class vistaTerminal {

    public String mostrarMedico(Medico medico){
        return medico.toString();
    }

    public String mostrarPaciente(Paciente paciente){
        return paciente.toString();
    }

    public String mostrarAdministrativo(Administrativo administrativo){
        return administrativo.toString();
    }

}
