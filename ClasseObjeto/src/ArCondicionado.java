import java.util.Random;

public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){}

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() < 3 ){
            System.out.println("Erro: Marca deve ter pelo menos tres caracteres");
        }
        else {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int novaTemperatura) {
        if (novaTemperatura < 16 || novaTemperatura > 30){
            System.out.println("Erro: Temperatura fora da faixa");
        }
        else {
        this.temperatura = temperatura;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


    private boolean verificarCompresor(){
        Random random = new Random();
        int numeroRandomico = random.nextInt(10);
        if (numeroRandomico > 2){
            return true;
        }
        System.out.println("Erro: Falha técnica");
        return false;
    }


    public void ativarModoTurbo(){

        if (!ligado){
            System.out.println("Erro: Ar está desligado");
            return;
        }

        boolean validacao = verificarCompresor();

        if (validacao){
            this.temperatura = 16;
        }
        else {
            System.out.println("Erro: Problema interno (500)");

        }
    }


    @Override
    public String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + ligado +
                '}';
    }
}
