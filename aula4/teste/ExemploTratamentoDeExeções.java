package teste;

public class ExemploTratamentoDeExeções {
    public static void main(String[] args) {
        String frase = null;
        String  novaFrase = null;

        try{

            novaFrase = frase.toUpperCase();

            System.out.println(novaFrase);
        } catch (java.lang.NullPointerException e ) {
            System.out.println(" A frase não pode ser vazia");
        }
    }
}