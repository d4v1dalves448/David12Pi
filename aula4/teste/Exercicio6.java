package teste;

public class Exercicio6 {

    public static void main(String[] args) {

        

        // declarar uma variável
        int soma=0; 
        
        // é uma repetição que executa um bloco de código várias vezes até chegar ao valor númerico de 1000 (inclusive)
        for (int i=1; i<=1000; i++) {

            // é uma estrutura que verifica o valor de i para ver se é divisível por 3 e por 5
            if (i % 3 == 0 && i % 5 == 0) {
            
                System.out.println(i);
                soma++; // incrementa a soma

            if (soma == 5) {
                break; // quebra o loop/ciclo se 5 números 

            
                }
            }
        }
    }
}