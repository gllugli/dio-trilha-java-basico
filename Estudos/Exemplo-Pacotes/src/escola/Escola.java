public class Escola {
    public static void main(String[] args) {

        Aluno felipe = new Aluno(); // Criação de um objeto

        // Definição de seus atributos - Método Setter
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        // Print do texto: O aluno Felipe tem 8 anos.
        System.out.printf("O aluno %s tem %d anos\n", felipe.getNome(), felipe.getIdade());

    }
}
