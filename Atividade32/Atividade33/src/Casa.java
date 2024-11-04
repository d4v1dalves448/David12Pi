public class Casa {

    // Variáveis de Instância
    private int quartos; // Número de quartos
    private int casaDeBanho; // Número de casas de banho
    private String rua; // Nome da rua


    // Construtor
    public Casa(int quartos, int casaDeBanho, String rua){
        this.quartos = quartos; // Inicializa os quartos
        this.casaDeBanho = casaDeBanho; //Inicializa as casas de banho
        this.rua = rua; // Inicializa rua
    }

    // Quartos
    public void setquartos(int quartos){
        this.quartos = quartos; // Define quartos
    }

    public int getQuartos(){
        return quartos; // Retorna quartos
    }

    // casa de banho
    public void setCasaDeBanho(int casaDeBanho){
        this.casaDeBanho = casaDeBanho; // Define casaDeBanho
    }

    public int getCasaDeBanho(){
        return casaDeBanho; // Retorna casaDeBanho
    }

    // rua
    public void setRua(String rua){
        this.rua = rua; // Define rua
    }

    public String getRua(){
        return rua; // Retorna rua
    }
}