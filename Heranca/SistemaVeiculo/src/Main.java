//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo v;

        v = new Aviao("Boeing", "747", 900, 10000);
        v.mover();

        v = new CarroEletrico("Tesla", "Model S", 120, 500);
        v.mover();
    }
    }
