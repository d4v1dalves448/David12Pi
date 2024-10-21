package teste;

import java.util.Scanner;

public class Exercicio29 {
    
    public static void main(String[] args) {    // Onde o programa começa
        Scanner input = new Scanner(System.in); // Cria um novo objeto Scanner para leitura de dados do utilizador

        System.out.println("Diga me um numero decimal: ");   // Pede um numero decimal
        double x = input.nextDouble(); // Lê um número decimal do utilizador e armazena em x

        int a = (int) x;    // Converte x para inteiro e armazena em a
        float b = (float) x;    // Converte x para float e armazena em b
        long c = (long) x;  // Converte x para long e armazena em c

        System.out.println("Numero original: "+ x); // Imprime o número original
        System.out.println("Número convertido em int: "+ a);    // Imprime o número convertido para inteiro
        System.out.println("Número convertido em float: "+ b);  // Imprime o número convertido para float
        System.out.println("Número convertido em long: "+ c);   // Imprime o número convertido para long
    }
}
