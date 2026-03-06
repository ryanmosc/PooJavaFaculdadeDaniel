public class Carro {
    // atributos / propriedades (variáveis)
    public String marca, modelo, placa;
    public boolean motor; // true (ligado) ou false (desligado)
    public float velAtual;
    // método construtor - tem o mesmo nome da classe
    public Carro(){

    }
    public Carro(String marca, String modelo, String placa, boolean motor, float velAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.velAtual = 0;
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor){
            this.motor = true;
            System.out.println("Carro foi ligado");
        }
    }
    // desligar o carro
    public void desligar(){
        if (this.motor){
            this.motor = false;
            System.out.println("Carro foi desligado");
        }
    }


    //Acelear Carro
    public void acelerarCarro(float veladicionar) {
        if (this.motor) {
            this.velAtual += veladicionar;
            System.out.println("Acelerando carro");
        }
        else {
            System.out.println("Motor esta desligado, quer acelearar como?");
        }
    }

    //Frear
    public void frearCarro(float valor){
        if (!this.motor){
            System.out.println("Motor desligado");
        }
        else if (valor > velAtual){
            System.out.println("Velocidade para frear não pode ser superior a velociadade atual ou inferiror a 0");
        }
        else if (valor < 0){
            System.out.println("Valor não pode ser abaixo de 0");
        }
       else{ this.velAtual -= valor;
    }
    }
    // operações (métodos)
    public String toString(){ // converte objeto para String
        // this representa objeto que chama o método
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Placa: " + this.placa +
                " Vel Atual: " + this.velAtual +
                " Motor: " + (this.motor ? "ligado": "desligado");
    }
}