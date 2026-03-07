public class SmartTv {

    private String marca;
    private String modelo;
    private int volume;
    private  boolean internet;

    public SmartTv(String marca, String modelo, int volume, boolean internet) {
        this.marca = marca;
        this.modelo = modelo;
        this.mostrarVolume(volume)  ;
        this.internet = internet;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        //Método de instancia, tipo ,lenght
        if (marca.length() <= 30) {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        char primeiraLetra = modelo.charAt(0);
         boolean maiuscula = Character.isUpperCase(primeiraLetra);
         if (maiuscula){
             this.modelo = modelo;
         }
         else {
             System.out.println("Coloque a primeira letra em maiusculo");
         }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.mostrarVolume(volume);
    }


    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public void mostrarVolume(int volume){
        if (volume >= 0 && volume <= 100 ){
            this.volume = volume;
        }
    }



    public void abrirYoutube(){
       boolean vaiAbrir = conectarNaInternet();
       if (vaiAbrir){
           System.out.println("Abrindo o youtube");
       }
       else {
           System.out.println("Sem sinal");
       }
    }

    private boolean conectarNaInternet(){
        System.out.println("Verificando conexões disponiveis");
        System.out.println("Consultando as credenciais");
        int numero = (int) (Math.random() * 10);
        if (numero < 5){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", volume=" + volume +
                ", internet=" + internet +
                '}';
    }
}
