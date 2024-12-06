public class conta {
    public float saldo = 0; // Saldo inicial da conta

    public void definirSaldo() {
        saldo = 10000; // Define saldo inicial como 10000
        System.out.println("Saldo definido: " + saldo); // Mostra o saldo inicial
    }

    public void depositar(float valor) {
        saldo += valor; // Adiciona o valor ao saldo
    }

    public void sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor; // Deduz o valor do saldo se for suficiente
        } else {
            System.out.println("Saldo insuficiente."); // Mostra mensagem de erro se o saldo for insuficiente
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo); // Mostra o saldo atual
    }
}