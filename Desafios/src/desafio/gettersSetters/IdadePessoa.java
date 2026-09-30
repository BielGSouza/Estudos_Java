package desafio.gettersSetters;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Você é maior de idade!! Vai ser preso jaja!!");
        } else {
            System.out.println("Vcoê é menor de idade!! Mas toma cuidado em!!");
        }
    }
}
