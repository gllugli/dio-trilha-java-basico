package encapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        // Abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
        
    }
}
