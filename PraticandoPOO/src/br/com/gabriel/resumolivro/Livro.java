package br.com.gabriel.resumolivro;

public class Livro {
    String nome;
    String autor;
    int paginas;

    void exibirInformacao() {
        System.out.printf("'%s' de %s com %d páginas!", nome, autor, paginas);
    }

    static void main(String[] args) {
        Livro novoLivro = new Livro();
        novoLivro.nome = "Dom Casmurro";
        novoLivro.autor = "Machado de Assis";
        novoLivro.paginas = 302;

        novoLivro.exibirInformacao();
    }
}
