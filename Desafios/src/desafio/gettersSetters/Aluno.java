package desafio.gettersSetters;

public class Aluno {
    private String nome;
    private int notas;
    private int quatidadeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas += notas;
        quatidadeNotas++;
    }

    public double calcularMedia() {
        return notas / quatidadeNotas;
    }
}
