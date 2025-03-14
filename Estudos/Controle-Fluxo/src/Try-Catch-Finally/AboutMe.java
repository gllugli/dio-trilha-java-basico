import java.util.InputMismatchException;
import java.util.Locale; // Mudar a linguagem do código
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in).useLocale(Locale.US); //Código para altera a linguagem

        try{
        
            
            System.out.println("Digite seu nome: ");
            String nome = s.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = s.next();

            System.out.println("Digite sua idade: ");
            int idade = s.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = s.nextDouble();

            System.out.println("Olá, me chamo" + nome.toUpperCase() + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm"); 

        } catch (InputMismatchException e) {

            System.out.println("Os campos idade e altura precisam ser numéricos");

        } 


        s.close();
    }
}
