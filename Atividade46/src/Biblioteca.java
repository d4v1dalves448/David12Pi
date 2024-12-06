import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livros> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivros(Livros livro) {
        livros.add(livro);
    }

    public void listaLivros() {
        for (Livros livro: livros) {
            System.out.println("" + livro.getTitulo());

        }
    }
}
