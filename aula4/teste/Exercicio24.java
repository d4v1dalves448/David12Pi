package teste;

import java.util.Scanner; // Importa a classe scanner

public class Exercicio24 { // Declaração da classe principal

    public static void main(String[] args) { // Onde o programa começa
        Scanner input = new Scanner(System.in); // Cria um novo objeto Scanner para leitura de dados do utilizador
        mensagemDeBoasVindas(); // Chama o método que mostra uma mensagem de boas-vindas
        System.out.print("Digite a sua idade: "); // Pede ao utilizador para inserir a sua idade
        int idade = input.nextInt(); // Lê a idade do utilizador
        if(idade >= 18){ // Verifica se a idade é 18 ou mais
            menu18(); // Chama o menu para maiores de 18 anos
        } else { // Se a idade for menor que 18
            menu(); // Chama o menu para menores de 18 anos
        }
    }

    public static void mensagemDeBoasVindas(){ // Método que mostra uma mensagem de boas-vindas
        System.out.println("Seja Bem Vindo " + user()); // Mostra a mensagem com o nome do utilizador
    }

    public static void menu(){ // Método que mostra o menu para menores de 18 anos
        Scanner input = new Scanner(System.in); // Cria um novo objeto Scanner para leitura de dados do utilizador
        int res; // Declara a variável de resposta do utilizador
        do { // Loop que mostra o menu até o utilizador escolher sair

            System.out.println("== Menu =="); // Título do menu
            System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Sair"); // Opções do menu
            res = input.nextInt(); // Lê a escolha do utilizador
        } while(res != 5); // Continua o loop até o utilizador escolher sair
    }

    public static String user() { // Método que retorna o nome do utilizador
        String user = "Maria Joana"; // Atribui o nome "Maria Joana" à variável user
        return user; // Retorna o nome do utilizador
    }

    public static void menu18(){ // Método que mostra o menu para maiores de 18 anos
        Scanner input = new Scanner(System.in); // Cria um novo objeto Scanner para leitura de dados do utilizador
        int res; // Declara a variável de resposta do utilizador

        do { // Loop que mostra o menu até o utilizador escolher sair
            System.out.println("== Menu =="); // Título do menu
            System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Carta de vinho\n6 - Sair"); // Opções do menu
            System.out.println("Resposta: "); // Pede a escolha do utilizador
            res = input.nextInt(); // Lê a escolha do utilizador
        } while(res != 6); // Continua o loop até o utilizador escolher sair
    }
}