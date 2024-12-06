public abstract class Veiculo {
    private String matricula;    // Atributo que armazena a matrícula do veículo.
    private double precoBase;    // Atributo que armazena o preço base para o aluguer do veículo.
    private int velocidadeAtual; // Atributo que armazena a velocidade atual do veículo.

    public Veiculo(String matricula, double precoBase) { // Construtor para inicializar a matrícula e o preço base do veículo.
        this.matricula = matricula;
        this.precoBase = precoBase;
        this.velocidadeAtual = 0; // A velocidade inicial é 0 quando o veículo é criado.
    }

    public String getMatricula() { // Método para obter a matrícula do veículo.
        return matricula;
    }

    public double getPrecoBase() { // Método para obter o preço base do veículo.
        return precoBase;
    }

    public int getVelocidadeAtual() { // Método para obter a velocidade atual do veículo.
        return velocidadeAtual;
    }

    protected void setVelocidadeAtual(int velocidade) { // Método protegido para definir a velocidade atual do veículo.
        this.velocidadeAtual = velocidade;
    }

    public abstract double calcularPrecoAluguer(int dias); // Método abstrato que deve ser implementado nas subclasses para calcular o preço do aluguer.

    public abstract void acelerar(); // Método abstrato para acelerar o veículo, implementado nas subclasses.

    public abstract void travar();   // Método abstrato para travar o veículo, implementado nas subclasses.
}