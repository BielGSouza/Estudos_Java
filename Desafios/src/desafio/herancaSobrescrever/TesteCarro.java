package desafio.herancaSobrescrever;

public class TesteCarro {
    static void main(String[] args) {
        ModeloCarro novoCarro = new ModeloCarro();
        novoCarro.definirModelo("Fiat Uno");
        novoCarro.definirPrecos(50000, 57000, 43000);
        novoCarro.exibirInfo();
    }
}
