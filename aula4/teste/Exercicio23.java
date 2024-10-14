package teste;

import java.util.Scanner;

public class Exercicio23 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            mensagemDeBoasVindas();

        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        if (idade >=18){
            menu18(); 
        } else{
            menu();
        }
     }
 
     // Método para exibir o menu
    public static void menu() {
         System.out.println("== Menu =="); 
         System.out.println("1- Entradas");
         System.out.println("2- Prato Carne");
         System.out.println("3- Prato Peixe");
         System.out.println("4- Sobremesa");
         System.out.println("5- Sair");
    }

    public static void mensagemDeBoasVindas() {
         System.out.println("Seja Bem Vindo "+ user()); 
    }

    public static String user() { 
        String nome = "Maria Joana";
        return nome;
    }

    public static void menu18() {
        System.out.println("== Menu =="); 
        System.out.println("1- Entradas");
        System.out.println("2- Prato Carne");
        System.out.println("3- Prato Peixe");
        System.out.println("4- Sobremesa ");
        System.out.println("5- Carta de Vinhos");
        System.out.println("6- Sair ");
    }
}
