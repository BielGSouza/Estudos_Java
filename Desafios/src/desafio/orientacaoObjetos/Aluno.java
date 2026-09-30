package desafio.orientacaoObjetos;

public class Aluno {
    String nome;
    int idade;

    void exibeInformacao() {
        System.out.printf("""
                =========================
                
                Nome: %s
                Idade: %d
                
                =========================
                """, nome, idade);
    }
}
