package desafio.gettersSetters;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(int desconto) {
        double calculoDoDesconto = preco * (1 - ((double) desconto / 100));
        System.out.println(calculoDoDesconto);
        return calculoDoDesconto;
    }

    static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Tocha");
        produto.setPreco(100);
        produto.aplicarDesconto(5);
    }
}
