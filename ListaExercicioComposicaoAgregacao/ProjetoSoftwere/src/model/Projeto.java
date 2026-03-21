package model;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private  int id;
    private String nomeProojeto;
    private List<Programador> programadores;

    public Projeto(){}

    public Projeto(int id, String nomeProojeto) {
        this.id = id;
        this.nomeProojeto = nomeProojeto;
        this.programadores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProojeto() {
        return nomeProojeto;
    }

    public void setNomeProojeto(String nomeProojeto) {
        this.nomeProojeto = nomeProojeto;
    }

    public List<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(List<Programador> programadores) {
        this.programadores = programadores;
    }

    public void adicionarProgramador(Programador programador){
        programadores.add(programador);
    }

    public void listarProgramadoresProjeto(){
        for (Programador p: programadores){
            System.out.println(p);
        }
    }


    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProojeto='" + nomeProojeto + '\'' +
                ",\n programadores=" + programadores +
                '}';
    }
}
