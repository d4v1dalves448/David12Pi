package teste;

public class Exercicio30 {
    
    public static void main(String[] args) {
        
        double[] notas = {16.9, 13.1, 8.3, 5.4, 2.0};  // Declara um array de doubles e inicializa com valores

        double soma = 0;    // Inicializa a variável soma com 0
        int nAlunos = 0;    // Inicializa a variável nAlunos com 0

        for(int i = 0; i < notas.length; i++){  // Itera sobre todas as notas
            soma += notas[i];   // Adiciona a nota atual à soma
            nAlunos ++; // Incrementa o número de alunos
        }

        double media = soma / nAlunos;  // Calcula a média
        int mediaInt = (int) media; // Converte a média para inteiro

        System.out.println("Número de alunos: "+ nAlunos);  // Mostra o número de alunos
        System.out.println("Média original: "+ media);  // Mostra a média original
        System.out.println("Média convertida: " + mediaInt);    // Mostra a média convertida para inteiro
    }
}