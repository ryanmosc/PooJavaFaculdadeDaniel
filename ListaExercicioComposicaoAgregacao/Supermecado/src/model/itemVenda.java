package model;

public class itemVenda {

    private int id;
    private int quantidade;
    private Produto produto;

    public itemVenda(){}

    public itemVenda(int id, int quantidade, Produto produto) {
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
        return "itemVenda{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
