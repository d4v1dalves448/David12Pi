public abstract class Bolo {
    // Variáveisde insância
    private String sabor;
    private int tamanho;
    private boolean cobertura;

    public Bolo(String sabor, int tamanho, boolean cobertura) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.cobertura = cobertura;
    }

    public Bolo (String sabor, boolean cobertura) {
        this.sabor = sabor;
        this.cobertura = cobertura;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean getCobertura() {
        return cobertura;
    }

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    // Apresenta os detalhes do bolo
    public void exibirDetalhes() {
        System.out.println("Sabor do bolo: " + sabor);
        System.out.println("Tamanho do bolo: " + tamanho);
        System.out.println("Cobertura: " + (cobertura ? "Sim": "Não"));
    }
    // Adiciona cobertura no bolo
    public void adicionarCobertura() cobertura = true; {

        //Forma de criacao de um metodo
        public abstract void tipoConfecao(); {
            System.out
        }
}
