public class BoloMorango {

    public BoloMorango(int tamanho, boolean cobertura) {

        super("Morango", tamanho, cobertura);
    }

    @Override
    public void tipoConfecao() {
        System.out.println("Este bolo será confecionada na lareira");
    }
}