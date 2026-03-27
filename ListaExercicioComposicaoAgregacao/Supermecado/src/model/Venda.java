package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private int id;
    private Cliente cliente;
    private List<ItenVenda> itenVendas;

    public Venda(){}

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itenVendas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItenVenda> getItenVendas() {
        return itenVendas;
    }

    public void setItenVendas(List<ItenVenda> itenVendas) {
        this.itenVendas = itenVendas;
    }

    public  void criarItenVenda(int id, int quantidade, Produto produto){
        ItenVenda itenVenda = new ItenVenda(id, quantidade, produto);
        itenVendas.add(itenVenda);
    }


    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", cliente=" + cliente +
                " \n,   itenVendas=" + itenVendas +
                '}';
    }
}

