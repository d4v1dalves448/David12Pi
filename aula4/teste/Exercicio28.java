package teste;

public class Exercicio28 {
    public static void main(String[] args) {

        int idade = 30;
        double tempo = 30.5;
        float fahrenheit = 305.9f;

        String um = Integer.toString(idade);
        String dois = Double.toString(tempo);
        String tres = Float.toString(fahrenheit);



        System.out.println("Valor int idade em String: " + um );
        System.out.println("Valor double tempo em String: " + dois );
        System.out.println("Valor float fahrenheit em String: " + tres );
    }
}