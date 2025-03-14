package encapsulamento;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        System.out.printf("\n");
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.printf("\n");
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens");
    }
}
