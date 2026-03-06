public class TestaCarro {
    public static void main(String args[]){
        // cria um objeto (instância da classe Carro)
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Palio";
        obj1.placa = "E2D31F0";
        obj1.motor = false;
        obj1.velAtual = 0;
        System.out.println(obj1.toString());
        obj1.ligar();
        System.out.println(obj1.toString());
        //Observação o professor disse em sala de aula que se um carro acelear e o valor vai dar negativo, desconsiiderar e colocar o valor

        Carro obj2 = new Carro("Fiat", "Palio", "E2D31F0", true, 0);
        System.out.println(obj2.toString());
        System.out.println(obj2.toString());
        obj2.acelerarCarro(100);
        System.out.println(obj2.toString());
        obj2.frearCarro(1000);
        System.out.println(obj2);

    }
}
