public class Main {
    public static void main(String[] args) {
        ContaBancaria contaDavid = new ContaBancaria();

        contaDavid.depositar( 100);

        System.out.println("Saldo atual da conta: " + contaDavid.getSaldo());

        contaDavid.levantar( 45.5);
        System.out.println();
        System.out.println();


    }
}