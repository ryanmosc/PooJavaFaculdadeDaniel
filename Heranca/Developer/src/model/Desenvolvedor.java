package model;

public class Desenvolvedor {
    protected String nome;
    protected String linguagem;
    protected float salario;

    public Desenvolvedor (){}

    public Desenvolvedor(String nome, String linguagem, float salario) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.salario = salario;
    }

    public Desenvolvedor(String daniel) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public void codar(){}

    public float calcularBonus(){
        return 0;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
}
