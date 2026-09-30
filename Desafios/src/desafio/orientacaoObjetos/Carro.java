package desafio.orientacaoObjetos;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.printf("""
                ==========================
                Ficha Técnica
                
                Modelo: %s
                Ano: %d
                Cor: %s
                ==========================
                """, modelo, ano, cor);
    }

    int calcularIdadeDoCarro() {
        return 2026 - ano;
    }
}
