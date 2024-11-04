public class Data {

    // Variáveis de Instância
    private int dia; // Dia do mês
    private int mes; // Mês do ano
    private int ano; // Ano

    // Construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia; // Inicializa o dia
        this.mes = mes; // Inicializa o mês
        this.ano = ano; // Inicializa o ano
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