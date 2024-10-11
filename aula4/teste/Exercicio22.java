package teste;

public class Exercicio22 {
    public static void main(String[] args) {
       mensagemDeBoasVindas();
       menu(); 
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
    // Método para exibir o menu
    public static void mensagemDeBoasVindas() {
        System.out.println("Seja Bem Vindo"); 
    }
}