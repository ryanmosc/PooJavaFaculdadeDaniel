import model.Emprestimo;
import model.Leitor;
import model.Livro;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro(1, "Senhor dos aneis", "Hobbit");
        Leitor leitor = new Leitor(1, "Ryan");
        Emprestimo emprestimo = new Emprestimo(LocalDateTime.now(), leitor, livro);
        System.out.println(emprestimo);
    }
}