package model;

import java.time.LocalDateTime;

public class Emprestimo
{

    private LocalDateTime dataEmprestimo ;
    private LocalDateTime dataDevolucao;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(){}

    public Emprestimo( LocalDateTime dataDevolucao, Leitor leitor, Livro livro) {
        this.dataEmprestimo = LocalDateTime.now();
        this.dataDevolucao = dataDevolucao;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", \n leitor=" + leitor +
                ", \n livro=" + livro +
                '}';
    }
}
