public class Main {
    public statitc void main(String[] args) {
        // Criar um objeto das classes criadas
        Professor professor = new Professor("Maria");
        Aluno aluno = new Aluno("Vicente");
        Escola escola = new Escola();

        // Chamar o metedo
        escola.darAulas(professor, aluno);
    }
}
