import model.Filme;
import model.Sessao;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme f1 = new Filme(1, "Batman", "Ação", 180);
        Filme f2 = new Filme(2, "Duna", "Ficção Científica", 155);


        LocalDateTime dataHora = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao = new Sessao(1, dataHora, 1);


        sessao.vincularFilme(f1);


        sessao.venderIngresso(1, "A1", "Inteira", 30.0f);
        sessao.venderIngresso(2, "A2", "Meia", 15.0f);
        sessao.venderIngresso(3, "A3", "Inteira", 30.0f);


        System.out.println(sessao);
    }
}