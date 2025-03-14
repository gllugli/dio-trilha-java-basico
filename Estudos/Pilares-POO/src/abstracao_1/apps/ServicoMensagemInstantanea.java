package abstracao_1.apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet");
    }

    // O protected autoriza todos os filhos a acessarem o método e autoriza tbm todas as classes do pacote
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens");
    }
    
}
