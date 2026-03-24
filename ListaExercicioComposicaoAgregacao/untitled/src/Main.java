import model.Edificio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Evidencie", "Morada do verde");
        System.out.println(edificio);
        edificio.criarApartamento(1, 1);
        edificio.criarApartamento(2, 2);
        System.out.println(edificio);
    }
}