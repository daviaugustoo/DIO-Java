import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo da conta:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        sc.close();
    }
}
