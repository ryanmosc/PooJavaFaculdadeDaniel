import java.util.ArrayList;

public class EmpresaLogistica {

    private String nomeEmpresa;
    private ArrayList<Veiculo> frota;


    public EmpresaLogistica(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.frota = new ArrayList<>();
    }

    public  void adicionarVeiculo(Veiculo v){
        frota.add(v);
    }

    public void gerarRelatorioCustos(double distancia){
        for (Veiculo v: frota){
           double custo = v.calcularCustoViagem(distancia);
            System.out.println(custo);
        }
    }


}
