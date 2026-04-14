//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Camera cam1 = new Camera("Portaria", true, "1080p");
        Camera cam2 = new Camera("Garagem", true, "4K");

        SensorMovimento s1 = new SensorMovimento("Entrada", true, 0.8);
        SensorMovimento s2 = new SensorMovimento("Corredor", false, 0.5);


        Gerenciadora cond = new Gerenciadora("Residencial Franca");


        cond.adicionarDispositivo(cam1);
        cond.adicionarDispositivo(cam2);
        cond.adicionarDispositivo(s1);
        cond.adicionarDispositivo(s2);

        // Executando teste geral
        cond.testeGeralSeguranca();
    }

}