package desafio.orientacaoObjetos;

public class Menu {
    static void main(String[] args) {
        Pessoa mensagem = new Pessoa();
        mensagem.exibirMensagemDeOla();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcularODobroDoNumero(3));

        Musica musica = new Musica();
        musica.titulo = "Fotos";
        musica.artista = "Vitor e Léo";
        musica.anoDeLancamento = 2007;
        musica.exibirFichaTecnica();
        musica.avaliar(5);
        musica.avaliar(10);
        musica.avaliar(7);
        System.out.println(musica.mediaAvaliacao());

        Carro carro = new Carro();
        carro.modelo = "Fiat Uno";
        carro.ano = 2000;
        carro.cor = "Azul";
        carro.exibirFichaTecnica();
        System.out.println(carro.calcularIdadeDoCarro());

        Aluno aluno = new Aluno();
        aluno.nome = "Gabriel de Sozua Almeida";
        aluno.idade = 19;
        aluno.exibeInformacao();
    }
}
