package abstracao_1;

import abstracao_1.apps.FacebookMessenger;
import abstracao_1.apps.MSNMessenger;
import abstracao_1.apps.ServicoMensagemInstantanea;
import abstracao_1.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
