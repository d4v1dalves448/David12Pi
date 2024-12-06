
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        boolean loop = true;

        do {
            System.out.print("""
                    ====== Sistema de Atendimento ======
                    
                    1. Adicionar cliente
                    2. Ver próximo cliente
                    3. Atender cliente
                    4. Exibir fila
                    5. Sair
                    
                    Escolha uma opção: """);
            int resposta = input.nextInt();

            switch (resposta){
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    fila.add(input.next());

                    System.out.println("Fila atual: "+ fila);
                    System.out.println("--------------------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("Proximo cliente: "+ fila.peek());
                    System.out.println("Fila atual: "+ fila);
                    System.out.println("--------------------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("Cliente atendido: "+ fila.poll());
                    System.out.println("Fila atual: "+ fila);
                    System.out.println("--------------------------------------------------------------------");
                    break;

                case 4:
                    System.out.println("Fila atual: "+ fila);
                    System.out.println("--------------------------------------------------------------------");
                    break;

                case 5:
                    loop= false;
                    break;

            }

        }while(loop);


    }
}