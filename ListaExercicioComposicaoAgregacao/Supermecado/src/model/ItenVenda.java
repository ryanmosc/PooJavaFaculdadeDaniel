package model;

public class ItenVenda {

    private int id;
    private int quantidade;
    private Produto produto;

    public ItenVenda (){}

    public ItenVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItenVenda{" +
                "quantidade=" + quantidade +
                ", id=" + id +
                ", produto=" + produto +
                '}';
    }
}
