import java.util.Scanner; // Importa a classe Scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cria um Scanner para ler os dados do utilizador
        conta minhaConta = new conta(); // Cria uma nova instância de Conta

        minhaConta.definirSaldo(); // Define o saldo inicial
        minhaConta.exibirSaldo(); // Exibe o saldo inicial

        System.out.print("Digite o valor a depositar: ");
        float valorDeposito = input.nextFloat(); // Lê o valor a depositar
        minhaConta.depositar(valorDeposito); // Deposita o valor lido
        minhaConta.exibirSaldo(); // Exibe o saldo após o depósito

        System.out.print("Digite o valor a sacar: ");
        float valorSaque = input.nextFloat(); // Lê o valor a sacar
        minhaConta.sacar(valorSaque); // Saca o valor lido
        minhaConta.exibirSaldo(); // Exibe o saldo após o saque

        input.close(); // Fecha o Scanner
    }
}