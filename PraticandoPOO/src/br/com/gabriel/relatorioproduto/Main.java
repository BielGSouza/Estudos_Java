package br.com.gabriel.relatorioproduto;

public class Main {
    static void main(String[] args) {
        Produto novoProduto = new Produto();
        novoProduto.nome = "Caixa de Leite";
        novoProduto.preco = 15;
        novoProduto.quantidade = 30;

        novoProduto.exibirInformacao();
    }
}
