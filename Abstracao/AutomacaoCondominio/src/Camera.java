public class Camera extends DispositivoSeguranca implements  DispositivoConectado{
    private String resolucao;

    public Camera(String localizacao, boolean ativo, String resolucao) {
        super(localizacao, ativo);
        this.resolucao = resolucao;
    }

    @Override
    public  void dispararAlerta(){
        System.out.println( "Movimento detectado em" + localizacao +". Acionando luzes de emergência");
    }

    @Override
    public void conectarWiTone(){
        System.out.println("Câmera conectada via protocolo seguro SSL");
    }

    @Override
    public void realizarAutodiagnostico() {
        System.out.println("Câmera em " + localizacao + " realizou autodiagnóstico com sucesso");
    }
}
