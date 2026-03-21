import model.Atleta;
import model.Time;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Atleta atleta = new Atleta(1, "Ryan", "Atacante");
        Time time = new Time(1,"Francana", "Daniel" );
        time.contratarAtleta(atleta);
        System.out.println(time);
        time = null;
        System.out.println(time);
        System.out.println(atleta);

    }
}