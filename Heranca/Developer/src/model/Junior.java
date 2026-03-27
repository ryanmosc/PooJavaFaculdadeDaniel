package model;

public class Junior extends Desenvolvedor{

    private String mentor;

    public Junior(){}

    public Junior(String mentor) {
        this.mentor = mentor;
    }

    public Junior(String nome, String linguagem, float salario, String mentor) {
        super(nome, linguagem, salario);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public void codar(){

    }

    @Override
    public String toString() {
        return "Junior{" +
                "mentor='" + mentor + '\'' +
                '}';
    }
}
