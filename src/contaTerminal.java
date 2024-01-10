import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner digitar = new Scanner(System.in);
        System.out.println("Bem vindo ao banco. Digite sua agência.");
        agencia = digitar.nextLine();
        System.out.println("Muito obrigado. Agora, digite o número de sua conta.");
        numero = digitar.nextInt();
        System.out.println("Qual o seu nome?");
        digitar.nextLine();
        nomeCliente = digitar.nextLine();
        System.out.println("Por favor, indique o valor do depósito inicial.");
        saldo = digitar.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque."
        );



    }
}
