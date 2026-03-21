import model.Programador;
import model.Projeto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Programador programador1 = new Programador(1, "Ryan", "Java");
        Programador programador2 = new Programador(2, "Luciano", "Python");

        Projeto projeto = new Projeto(1, "Biblioteca");
        projeto.adicionarProgramador(programador1);
        projeto.adicionarProgramador(programador2);

        System.out.println(projeto);

        projeto.listarProgramadoresProjeto();

    }
}