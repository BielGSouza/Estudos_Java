import java.util.Scanner;

public class DesafioNumeros {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        while (opcao != -1) {
            System.out.println("""
                =======================================
                
                    Menu
                
                   -1 - Sair
                    1 - Identificar sinal (+ ou -)
                    2 - Comparar números 
                    3 - Calcular área do quadrado
                    4 - Calcular área do círculo
                    5 - Exibir tabuada do número
                    6 - Verificar se é impar ou par    
                    7 - Calcular fatorial
                
                =======================================
                """);
            opcao = leitor.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println();
                    System.out.println("--Identificar numero positivo ou negativo--");
                    System.out.println();
                    System.out.println("Informe o número à ser identificado:");
                    int numero = leitor.nextInt();

                    if (numero >= 0) {
                        System.out.println("Seu número é positivo!!");
                    } else {
                        System.out.println("Seu número é negativo!!");
                    }

                    break;
                case 2:
                    System.out.println();
                    System.out.println("--Comparar dois números--");
                    System.out.println();
                    System.out.println("Informe o primeiro número:");
                    int primeiroNum = leitor.nextInt();
                    System.out.println();
                    System.out.println("Informe o segundo número:");
                    int segundoNum = leitor.nextInt();

                    if (primeiroNum == segundoNum) {
                        System.out.println("Os números são iguais!!");
                    } else {
                        System.out.println("Os números são diferentes!!");
                    }

                    if (primeiroNum > segundoNum) {
                        System.out.println("O primeiro número " + primeiroNum + " é maior que o segundo número " + segundoNum);
                    } else {
                        System.out.println("O segundo número " + segundoNum + " é maior que o primeiro número " + primeiroNum);
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("--Calcular área do quadrado--");
                    System.out.println();

                    System.out.println("Informe a medida do lado do quadrado:");
                    double ladoDoQuadrado = leitor.nextDouble();
                    System.out.println();

                    double valorDaAreaDoQuadrado = ladoDoQuadrado * ladoDoQuadrado;

                    System.out.println("A área do quadrado é: " + valorDaAreaDoQuadrado);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("--Calcular área do círculo--");
                    System.out.println();

                    System.out.println("*irei considera π como 3,14*");
                    System.out.println();

                    System.out.println("Informe o raio do círculo:");
                    double raioDoCirculo = leitor.nextDouble();
                    System.out.println();

                    double valorDaAreaDoCirculo = 3.14 * (raioDoCirculo * raioDoCirculo);

                    System.out.println("A área do círculo é: " + valorDaAreaDoCirculo);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("--Tabuada do 1 ao 10--");
                    System.out.println();

                    System.out.println("Informe o número para a tabuada:");
                    int numeroTabuada = leitor.nextInt();
                    System.out.println();

                    System.out.println("Tabuada");
                    for (int i = 1; i < 11; i++) {
                        int calculoTabuada = i * numeroTabuada;
                        System.out.println(i + " x " + numeroTabuada + ": " + calculoTabuada);
                    }
                    break;
                case 6:
                    System.out.println();
                    System.out.println("--Verificar se número é impar ou par--");
                    System.out.println();

                    System.out.println("Informe o número:");
                    double numeroVerificarTipo = leitor.nextDouble();
                    System.out.println();

                    double calculoImparPar = numeroVerificarTipo % 2;

                    if (calculoImparPar == 1) {
                        System.out.println("Seu número é Impar!!");
                    } else {
                        System.out.println("Seu número é Par!!");
                    }
                    break;
                case 7:
                    System.out.println();
                    System.out.println("--Calcular fatorial--");
                    System.out.println();

                    System.out.println("Informe seu número para calcularmos o fatorial dele:");
                    int numeroFatorial = leitor.nextInt();
                    System.out.println();

                    int calculoFatorial = 1;

                    for (int i = numeroFatorial; i > 0; i--) {
                        calculoFatorial *= i;
                    }

                    System.out.println("Resultado do fatorial: " + calculoFatorial);
            }
        }
    }
}
