package model;

import java.time.LocalDateTime;

public class Consulta {

    private int valorConsulta;
    private LocalDateTime dataConsulta;
    private Paciente paciente;
    private Medico medico;

    public Consulta(){}

    public Consulta(int valorConsulta, LocalDateTime dataConsulta, Paciente paciente, Medico medico) {
        this.valorConsulta = valorConsulta;
        this.dataConsulta = dataConsulta;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "valorConsulta=" + valorConsulta +
                ", dataConsulta=" + dataConsulta +
                ", \n paciente=" + paciente +
                ", \n medico=" + medico +
                '}';
    }
}
