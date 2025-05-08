
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scan.nextInt();
        scan.nextLine(); // Limpa o buffer do teclado

        System.out.println("Por favor, digite o número da Agência:");
        String Agencia = scan.nextLine();

        System.out.println("Por favor, digite o seu Nome completo:");
        String NomeCompleto = scan.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        float Saldo = scan.nextFloat();

        scan.close();

        System.out.println("Olá " + NomeCompleto + ", obrigado por criar uma conta em nosso banco! Sua agência é " + Agencia + ", conta " + numeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
