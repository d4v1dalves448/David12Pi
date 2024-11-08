public class Data {

    // Variáveis de Instância
    private int dia; // Dia do mês
    private int mes; // Mês do ano
    private int ano; // Ano

    // Construtor
    public Data() {
        this.dia = 1; // Inicializa o dia
        this.mes = 1; // Inicializa o mês
        this.ano = 1; // Inicializa o ano
    }

    // Dia
    public void setDia(int dia) {
        this.dia = dia; // Define o dia
    }

    public int getDia() {
        return dia; // Retorna o dia
    }

    // Mês
    public void setMes(int mes) {
        this.mes = mes; // Define o mês
    }

    public int getMes() {
        return mes; // Retorna o mês
    }

    // Ano
    public void setAno(int ano) {
        this.ano = ano; // Define o ano
    }

    public int getAno() {
        return ano; // Retorna o ano
    }

    // Método para exibir a data completa
    public String exibirData() {
        return dia + "/" + mes + "/" + ano; // Retorna a data no formato dia/mês/ano
    }
}