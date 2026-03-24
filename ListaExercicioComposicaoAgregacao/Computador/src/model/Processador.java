package model;

public class Processador {

    private String marcaProcessador;
    private String modelo;
    private double frequencia;

    public Processador(){}

    public Processador(String marcaProcessador, String modelo, double frequencia) {
        this.marcaProcessador = marcaProcessador;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marcaProcessador;
    }

    public void setMarca(String marca) {
        this.marcaProcessador = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marcaProcessador + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frequencia=" + frequencia +
                '}';
    }
}
