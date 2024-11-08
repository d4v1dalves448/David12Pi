public class BoloChocolate extends Bolo{

    public BoloChocolate(int tamanho, boolean cobertura) {

        super("Chocolate", tamanho, cobertura);
    }

    @Override
    public void tipoConfecao() {
        System.out.println("Este bolo será confecionada no forno");
    }
}