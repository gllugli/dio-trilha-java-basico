import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numeroConta = s.nextInt();

        s.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = s.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = s.nextLine();
        
        System.out.println("Digite o saldo da conta: ");
        saldo = s.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        s.close();

    }
}
