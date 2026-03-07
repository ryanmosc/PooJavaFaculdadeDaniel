public class SmartTv {

    private String marca;
    private String modelo;
    private int volume;
    private  boolean internet;

    public SmartTv(String marca, String modelo, int volume, boolean internet) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.internet = internet;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
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
