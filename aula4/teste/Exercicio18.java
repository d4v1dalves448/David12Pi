package teste;

import java.util.Scanner;
import java.util.Vector;

public class Exercicio18 {
    
    public static void main(String[] args) {
        //Cria objeto scanner
        Scanner input = new Scanner(System.in);
        int num, soma = 0;

        // Cria um vector para armazenar os números inseridos pelo utilizador
        Vector<Integer> vector = new Vector<>();

        //Le os numeros do utilizador até inserir 0
        do {
            System.out.println("Insira um número (0 para cancelar): ");
            //Pede ao utilizador um numero
            num = input.nextInt();

            if(num != 0) {
        
                // Adicionar os números ao vector 
                vector.add(num);

                // Soma os valores que o utilizador insere
                soma += num;
            }
        } while (num !=  0);

        // Calcula o resto da divisao por 2
        int resto = soma%2; 

        //Apresenta o valor total dos numeros inseridos pelo utilizador
        System.out.println("Resto de todos os numeros somados: " + resto);
    }
}