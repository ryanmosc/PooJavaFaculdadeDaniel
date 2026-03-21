package model;

import java.time.LocalDateTime;

public class Voo {

    private Integer numero;
    private String origem;
    private String destino;
    private LocalDateTime data;

    public Voo(){}

    public Voo(Integer numero, String origem, String destino, LocalDateTime data) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }


    @Override
    public String toString() {
        return "model.Voo{" +
                "numero=" + numero +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data=" + data +
                '}';
    }
}
