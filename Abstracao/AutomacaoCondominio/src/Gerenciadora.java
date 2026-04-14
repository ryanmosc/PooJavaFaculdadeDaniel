import java.util.ArrayList;
import java.util.List;

public class Gerenciadora {

    private String nome;
    private List<DispositivoSeguranca> dispositivoSeguranca;

    public Gerenciadora(String nome) {
        this.nome = nome;
        this.dispositivoSeguranca = new ArrayList<>();
    }

    public void adicionarDispositivo(DispositivoSeguranca d){
        dispositivoSeguranca.add(d);
    }

    public void testeGeralSeguranca(){
        for (DispositivoSeguranca d: dispositivoSeguranca){
            d.dispararAlerta();
            d.status();
            if (d instanceof DispositivoConectado){
                ((DispositivoConectado) d).realizarAutodiagnostico();
            }
        }
    }

}
