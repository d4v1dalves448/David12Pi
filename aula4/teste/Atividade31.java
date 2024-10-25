package teste;

import java.util.Scanner; // Importa Scanner

public class Atividade31 { // Declaração da classe principal

    public static void main(String[] args) { // Método principal do programa
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner para ler dados
        int num1 = 0, num2 = 0; // Inicializa as variáveis num1 e num2

    // Loop para ler num1
    while (true) {
        try {
            System.out.print("Diga me um número: "); // Pede um número para digitar
            num1 = input.nextInt(); // Lê o número
            break; // Sai do loop se não houver erro
        } catch (java.util.InputMismatchException e) { // Se a entrada for inválida
            System.out.println("Erro: Por favor, insira um número inteiro válido."); // Mensagem de erro
            input.nextLine(); // Limpa o buffer do scanner
        }
    }

    // Loop para ler num2
    while (true) {
        try {
            System.out.print("Diga me um número: "); // Pede outro número para digitar
            num2 = input.nextInt(); // Lê o número
            if (num2 == 0) { // Se o número for zero
            System.out.println("Erro: O divisor não pode ser zero! Por favor diga me outro a baixo "); // Mensagem de erro
                continue; // Continua o loop
            }

            break; // Sai do loop se não houver erro
        } catch (java.util.InputMismatchException e) { // Se a entrada for inválida
            System.out.println("Erro: Por favor, insira um número inteiro válido. "); // Mensagem de erro
            input.nextLine(); // Limpa o buffer do scanner
        }
    }

            int res = num1 / num2; // Divide o num1 por o num2
            System.out.println("A resposta é: " + res); // Mostra o resultado
            input.close(); // Fecha o Scanner
    }
}