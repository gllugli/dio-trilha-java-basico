package estudo_enum;

public class SistemaIbge {
    public static void main(String[] args) {
        // for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
        //     System.out.println("Nome: " + e.getNome() + " - Sigla: " + e.getSigla());
        // }

        // Criando um objeto igual ao enum pré-criado na classo EstadoBrasileiro
        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
