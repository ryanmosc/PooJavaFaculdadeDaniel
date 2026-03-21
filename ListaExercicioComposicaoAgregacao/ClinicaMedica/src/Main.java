import model.Consulta;
import model.Medico;
import model.Paciente;

import java.time.LocalDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Medico medico = new Medico(1, "Joao", "NEUROCCIRURGIAO");
        Paciente paciente = new Paciente(1, "Ryan", "45964965873");
        Consulta consulta = new Consulta(250, LocalDateTime.of(2026, 12, 10, 13, 30), paciente, medico);
        System.out.println(consulta);

    }
}