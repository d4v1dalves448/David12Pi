package teste;

import java.util.Scanner;   // Importa a classe scanner

public class Exercicio25 {  // Declaração da classe principal

        
    public static void main(String[] args) {    // Onde o programa começa
        Scanner scanner = new Scanner(System.in);   // Cria um novo objeto Scanner para leitura de dados do utilizador
        mostrarMensagemDeBoasVindas();  // Chama o método que mostra uma mensagem de boas-vindas
        System.out.print("Insira o seu ano de nascimento: ");   // Pede ano de nascimento
        int anoNascimento = scanner.nextInt();  // Lê ano de nascimento
        System.out.print("Insira o ano atual: ");   // Pede ano atual
        int anoAtual = scanner.nextInt();   // Lê ano atual
        int idade = calcularIdade(anoNascimento, anoAtual); // Calcula idade
                
        if (idade >= 18) {  // Se maior ou igual a 18
        mostrarMenuAdulto(idade);   // Mostra menu adulto
    } else {    // Senão
        mostrarMenuMenor(); // Mostrar menu menor
        }
    }
        
    public static void mostrarMensagemDeBoasVindas() {  // Boas-vindas
        System.out.println("Bem-vindo, " + obterNomeUsuario()); // Mensagem
    }
        
    public static int calcularIdade(int anoNascimento, int anoAtual) {  // Calcula idade
        return anoAtual - anoNascimento;    // Subtrai anos
        }
        
    public static void mostrarMenuMenor() { // Menu menor
        Scanner scanner = new Scanner(System.in);   // Scanner para leitura
        int escolha;    // Variável escolha
        do {
        System.out.println("== Menu ==");   // Título do menu
        System.out.println("1 - Entradas"); // Opção 1
        System.out.println("2 - Prato de Carne");   // Opção 2
        System.out.println("3 - Prato de Peixe");   // Opção 3
        System.out.println("4 - Sobremesa");    // Opção 4
        System.out.println("5 - Sair"); // Opção 5
            escolha = scanner.nextInt();    // Lê escolha
        } while (escolha != 5); // Repete até escolher sair
    }
        
    public static void mostrarMenuAdulto(int idade) {   // Menu adulto
        Scanner scanner = new Scanner(System.in);   // Scanner para leitura
        int escolha;    // Variável escolha
    do {

        System.out.println("== Menu ==");   // Título do menu
        System.out.println("1 - Entradas"); // Opção 1
        System.out.println("2 - Prato de Carne");   // Opção 2
        System.out.println("3 - Prato de Peixe");   // Opção 3
        System.out.println("4 - Sobremesa");    // Opção 4
        System.out.println("5 - Carta de Vinho");  // Opção 5
        System.out.println("6 - Sair"); // Opção 6
        System.out.print("Escolha: ");  // Pede escolha
        escolha = scanner.nextInt();    // Lê escolha
    } while (escolha != 6); // Repete até escolher sair
    }
        
    public static String obterNomeUsuario() {   // Nome do usuário
        return "Maria Joana";   // Retorna nome
    }
}