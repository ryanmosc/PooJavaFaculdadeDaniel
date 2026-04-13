//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CanalNotificacao[] vetor = new CanalNotificacao[3];

        vetor[0] = new Email("com4ryan@gmail.com", "Teste", "Teste ");
        vetor[1] = new Sms("Ryan", "Seu código é 1234", 119999999);
        vetor[2]  = new WhatsApp("Ryan", "Mensagem via zap", "Visualizado");

        for (CanalNotificacao c: vetor){
            c.enviar();
        }
    }
}