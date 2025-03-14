package pilares;

// Extends = Herança
// Herda de Veiculo
public class Carro extends Veiculo {
    
    // Override = Sobrescrever
    // Sobrescreve o método ligar da classe Veiculo
    // Usado para gerar um erro caso esteja sobrescrevendo um método que não existe na classe pai
    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em P");
    }

}
