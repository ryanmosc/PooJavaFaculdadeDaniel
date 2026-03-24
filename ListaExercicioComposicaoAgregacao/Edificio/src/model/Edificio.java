package model;

import java.util.ArrayList;
import java.util.List;

public class Edificio {

    private String nomeEdificio;
    private String endereco;
    private List<Apartamento> apartamentos;

    public Edificio(){}

    public Edificio(String nomeEdificio, String endereco) {
        this.nomeEdificio = nomeEdificio;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public String getNomeEdificio() {
        return nomeEdificio;
    }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(List<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    public void criarApartamento(int num, int andar){
        Apartamento apartamento = new Apartamento(num, andar);
        apartamentos.add(apartamento);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nomeEdificio='" + nomeEdificio + '\'' +
                ", endereco='" + endereco + '\'' +
                ", \n apartamentos=" + apartamentos +
                '}';
    }
}
