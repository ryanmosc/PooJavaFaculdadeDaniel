import model.Passageiro;
import model.Reserva;
import model.Voo;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Passageiro passageiro1 = new Passageiro("45964965873", "Ryan");
        Voo voo1 = new Voo(1, "França", "Brasil", LocalDateTime.of(2026, 7, 15, 13, 10));
        System.out.println(voo1);

        Reserva reserva = new Reserva(1, LocalDateTime.now(), 1, passageiro1, voo1);
        System.out.println(reserva);
    }
}