package model;

import java.time.LocalDateTime;

public class Reserva {

    private Integer codigo;
    private LocalDateTime data;
    private Integer poltrona;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(){}

    public Reserva(Integer codigo, LocalDateTime data, Integer poltrona, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(Integer poltrona) {
        this.poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", data=" + data +
                ", poltrona=" + poltrona +
                ", \n passageiro=" + passageiro +
                ", \n voo=" + voo +
                '}';
    }
}
