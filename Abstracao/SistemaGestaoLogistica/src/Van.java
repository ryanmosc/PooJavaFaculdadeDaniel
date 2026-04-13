public class Van extends Veiculo{

    private boolean refrigerada;


    public Van(String placa, double capacidadeCarga, boolean refrigerada) {
        super(placa, capacidadeCarga);
        this.refrigerada = refrigerada;
    }

    @Override
    public double calcularCustoViagem(double distancia){
        if (refrigerada){
            return  (distancia * 3.00) + 100.00;
        }
        return   (distancia * 3.00);
    }
}
