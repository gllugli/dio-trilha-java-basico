package encapsulamento;

public class FacebookMessenger {
    public void enviarMensagem() {
        System.out.printf("\n");
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.printf("\n");
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens");
    }
}
