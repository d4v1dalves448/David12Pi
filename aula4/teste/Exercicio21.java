package teste;

public class Exercicio21 {
    public static void main(String[] args) {

        // Criação da matriz original 3x2
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };


        // Transposição da matriz
        int[][] matrizTransposta = new int[3][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }


        // Impressão da matriz transpostada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}