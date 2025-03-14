package encapsulamento;

public class Telegram {
    public void enviarMensagem() {
        System.out.printf("\n");
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.printf("\n");
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens");
    }
}
