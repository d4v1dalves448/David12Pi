0    package teste;

import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
    /*
    //Exercicio 6 
        for (int i=1; i<=20; i++){   
            System.out.println(i);
        }

        for (int i=1; i<=20; i++){
            System.out.println(i);
        }
     */

    // Exercicio 7
        //Cria um objeto para leitura
        Scanner input = new Scanner(System.in); 

        System.out.print("numero");
        int x = 0;

        for (int j = 0; j < 5; j++) {
            System.out.print("Digite um numero");
            int y = input.nextInt();
            if (x < y) {
                x = y;                
            }
        }
        System.out.println("maior: " + x);

    // Exercicio 8

        int numeros[]= new int[5];

        for(int i=1;i<=5;i++){
            System.out.print("numero "+ i +": ");
            numeros[i-1] = input.nextInt();
        } 
    }
}
