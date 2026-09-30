package desafio.orientacaoObjetos;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.printf("""
                ==================================
                Ficha Técnica
                
                Nome da Música: %s
                Artista: %s
                Ano de Lançamento: %d
                ==================================
                """, titulo, artista, anoDeLancamento);
    }

    void avaliar(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao() {
        return avaliacao / numAvaliacoes;
    }
}
