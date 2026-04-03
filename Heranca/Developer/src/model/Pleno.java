package model;

public class Pleno extends Desenvolvedor{

    private  int projetosEntregues;

    public Pleno(){}

    public Pleno(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }

    public Pleno(String nome, String linguagem, float salario, int projetosEntregues) {
        super(nome, linguagem, salario);
        this.projetosEntregues = projetosEntregues;
    }

    public Pleno(String bruno) {
    }

    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }
    @Override
    public float calcularBonus(){
        return 0;
    }

    @Override
    public void codar(){}

    @Override
    public String toString() {
        return "Pleno{" +
                "projetosEntregues=" + projetosEntregues +
                ", nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
}
