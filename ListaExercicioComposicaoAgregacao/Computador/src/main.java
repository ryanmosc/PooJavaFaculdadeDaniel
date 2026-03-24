import model.Computador;

public class main {
    public static void main(String[] args) {
        Computador computador = new Computador(1, "Pichau", "AMD", "RX7", 200.0);
        System.out.println(computador);
        computador =null;
        System.out.println(computador);
    }
}
