package desafio.gettersSetters;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.printf("""
                ========================
                Detalhes Do Livro
                
                Título: %s
                Autor: %s
                
                ========================
                """, titulo, autor);
    }
}
