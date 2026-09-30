package br.com.gabriel.relatorioproduto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirInformacao() {
        System.out.printf("""
                INFORMAÇÕES DO PRODUTO:
                
                NOME: %s
                PREÇO: %.2f
                QUANTIDADE: %d
                """, nome, preco, quantidade);
    }
}
