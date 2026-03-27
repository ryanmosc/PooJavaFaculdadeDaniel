import model.Cliente;
import model.Produto;
import model.Venda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto(1, "Gilete", 10.0);
        Produto produto2 = new Produto(2, "Computador", 500.00);

        Cliente cliente1 = new Cliente(1, "Ryan");
        Venda venda = new Venda(1, cliente1);
        venda.criarItenVenda(1, 20, produto1);
        venda.criarItenVenda(2, 50, produto2);
        System.out.println(venda);
    }
}