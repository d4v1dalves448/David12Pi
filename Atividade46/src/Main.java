public class Main {
    public static void main(String[] args) {
        // Instanciar aq classe
        Livros livro1 = new Livros("A guerra santa do Fred na wc");
        Livros livro2 = new Livros("Pobre de quem for depois do fred");
        Livros livro3 = new Livros("O probelma de quem passa muito tempo na sanita by fred");

        Biblioteca biblioteca = new Biblioteca();

        // Adicionar os livros na biblioteca
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);
        biblioteca.adicionarLivros(livro3);

        // Mostar a lista de livros
        biblioteca.listaLivros();
    }
}
