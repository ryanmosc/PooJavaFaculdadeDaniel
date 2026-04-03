package model;

public class Senior extends Desenvolvedor {

    private float verba;

    public Senior(){}

    public Senior(float verba) {
        this.verba = verba;
    }

    public Senior(String nome, String linguagem, float salario, float verba) {
        super(nome, linguagem, salario);
        this.verba = verba;
    }

    public Senior(String carlos) {
    }


    public float getVerba() {
        return verba;
    }

    public void setVerba(float verba) {
        this.verba = verba;
    }


    @Override
    public float calcularBonus(){
        return 0;
    }

    @Override
    public void codar(){}

    @Override
    public String toString() {
        return "Senior{" +
                "verba=" + verba +
                ", nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
}
