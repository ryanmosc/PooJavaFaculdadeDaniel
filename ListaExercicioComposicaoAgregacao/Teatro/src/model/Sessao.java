package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;

    // Agregação
    private Filme filme;

    // Composição
    private ArrayList<Ingresso> ingressos;

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // Agregação
    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    // Composição
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sessao:\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Horario: ").append(horario).append("\n");
        sb.append("Sala: ").append(sala).append("\n");

        sb.append("\nFilme:\n");
        sb.append(filme != null ? filme : "Nenhum filme vinculado").append("\n");

        sb.append("\nIngressos vendidos:\n");
        for (Ingresso i : ingressos) {
            sb.append(i).append("\n");
        }

        return sb.toString();
    }
}