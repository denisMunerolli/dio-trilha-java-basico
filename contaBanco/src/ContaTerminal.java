
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);
            
            double saldo = 237.48;
            
            System.out.println("Por favor, digite o numero da Agência");
            String ag = sc.nextLine();
            
            System.out.println("Por favor, digite o numero da Conta");
            int conta = sc.nextInt();
            sc.nextLine(); //inserido apenas para consumir uma quebra de linha vazia
            
            System.out.println("Porfavor, digite seu Nome");
            String nome = sc.nextLine();
            
            System.out.println("Ola"+ nome +", Obrigado por se cadastrar em nosso banco,");
            System.out.println("sua agencia é "+ ag +", conta corrente numero " + conta +" e seu saldo "+ saldo +" ja esta disponivel para saque.");
        }



    }
}
