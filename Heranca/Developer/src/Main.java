import model.Desenvolvedor;
import model.Junior;
import model.Pleno;
import model.Senior;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Ana");
        devs[1] = new Pleno("Bruno");
        devs[2] = new Senior("Carlos");
        devs[3] = new Desenvolvedor("Daniel");

        for (Desenvolvedor dev : devs) {
            dev.codar();
            System.out.println("Bônus: " + dev.calcularBonus());
            System.out.println(dev.toString());
            System.out.println("------------------------");
        }
    }
}