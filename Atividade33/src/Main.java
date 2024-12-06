public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(4,3,"Rua das arvores"); // Cria uma nova Casa com 4 quartos, 3 casas de banho e a localização

        System.out.println(casa1.getQuartos()); // Mostra o número de quartos
        System.out.println(casa1.getCasaDeBanho()); // Mostra o número de casas de banho
        System.out.println(casa1.getRua()); // Mostra a rua onde a casa está localizada
    }
}