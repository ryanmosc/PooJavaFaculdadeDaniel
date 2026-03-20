import java.util.Random;

public class Drone {

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(){}

    public Drone(String codigo, int bateria) {
        this.codigo = codigo;
        this.altura = 0;
        this.bateria = bateria;
        this.emVoo = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (!emVoo){
            System.out.println("Erro: Drone não está em voo");
        }
        if (altura > 120 || altura < 0){
            System.out.println("Erro: Altura fora dos padroes: " + altura);
            return;
        }
        else {
            this.altura = altura;
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria > 100 || bateria < 0){
            System.out.println("Erro: Bateria fora dos padroes de seguranca: " + bateria);
        }
        else {
            this.bateria = bateria;
        }
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    Random random = new Random();
    private boolean testarMotores(){
        System.out.println("Testando helices e Calibrando GPS");
        int numeroAleatorio = random.nextInt(10);
        if (numeroAleatorio < 8){
            return true;
        }
        else {
            return false;
        }

    }



    public void decolarDrone(){
        if (bateria < 20){
            System.out.println("Erro: Bateria deve estar acima de 20%");
            return;
        }

        boolean validacao = testarMotores();
        if (validacao){
            this.emVoo = true;
            this.altura = 2;
        }
        else {
            System.out.println("Erro ao testar motores");
        }
    }

    @Override
    public String toString() {
        return "Drone{" +
                "codigo='" + codigo + '\'' +
                ", altura=" + altura +
                ", bateria=" + bateria +
                ", emVoo=" + emVoo
              ;
    }
}
