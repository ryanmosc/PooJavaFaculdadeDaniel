//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Cenario Perfeito
        ArCondicionado ar1 = new ArCondicionado( );
        ar1.setMarca("Samsung");
        ar1.setModelo("L200");
        ar1.setTemperatura(17);
        ar1.setLigado(true);
        System.out.println(ar1);

        //*Falha na marca
        ArCondicionado ar2 = new ArCondicionado();
        ar2.setMarca("LG");
        ar2.setModelo("C100");
        ar2.setTemperatura(20);
        ar2.setLigado(true);


        //Falha na temperatura
        ArCondicionado ar3 = new ArCondicionado();
        ar3.setMarca("NOKIA");
        ar3.setModelo("N100");
        ar3.setTemperatura(15);
        ar3.setLigado(true);

        ar1.ativarModoTurbo();
        System.out.println(ar1);
    }
}