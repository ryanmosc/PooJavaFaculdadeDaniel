//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciando o Drone
        Drone drone1 = new Drone();
        drone1.setCodigo("ADHAUWS");
        drone1.setBateria(20);
        System.out.println(drone1);

        //Ligando o drone
        drone1.decolarDrone();
        System.out.println(drone1);
    }
}