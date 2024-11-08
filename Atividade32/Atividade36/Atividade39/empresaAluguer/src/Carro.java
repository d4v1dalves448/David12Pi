public class Carro extends Veiculo { // Define a classe "Carro" que estende a classe base "Veiculo".
    private boolean temArCondicionado; // Atributo que indica se o carro tem ar condicionado.

    public Carro(String matricula, double precoBase, boolean temArCondicionado) { // Construtor da classe "Carro".
        super(matricula, precoBase); // Chama o construtor da classe "Veiculo" para inicializar a matrícula e o preço base.
        this.temArCondicionado = temArCondicionado; // Define se o carro tem ar condicionado.
    }

    @Override
    public double calcularPrecoAluguer(int dias) { // Implementa o cálculo do preço de aluguer específico para o carro.
        double taxaAr = temArCondicionado ? 1.2 : 1.0; // Define uma taxa adicional se o carro tiver ar condicionado.
        return getPrecoBase() * taxaAr * dias; // Calcula o preço com base no preço base, na taxa e no número de dias.
    }

    @Override
    public void acelerar() { // Método que aumenta a velocidade do carro em 10 km/h.
        setVelocidadeAtual(getVelocidadeAtual() + 10); // Atualiza a velocidade atual.
        System.out.println("Carro acelerou. Velocidade atual: " + getVelocidadeAtual() + " km/h"); // Exibe a nova velocidade.
    }

    @Override
    public void travar() { // Método que reduz a velocidade do carro em 10 km/h.
        setVelocidadeAtual(Math.max(0, getVelocidadeAtual() - 10)); // Garante que a velocidade não fica abaixo de 0.
        System.out.println("Carro travou. Velocidade atual: " + getVelocidadeAtual() + " km/h"); // Exibe a nova velocidade.
    }
}