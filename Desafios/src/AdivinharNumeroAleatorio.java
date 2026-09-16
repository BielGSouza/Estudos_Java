//Esse desafio consiste em fazer um jogo de adivinhação:
//O user tera 5 tentaivas
//O jogo dve indicar quando ele esta acima ou abaixo do numero

import java.util.Random;
import java.util.Scanner;

public class AdivinharNumeroAleatorio {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroDigitado;

        System.out.println(numeroAleatorio);

        System.out.println("""
                ====================================
                BEM-VINDO
                Esse é o jogo de adivinhar o número,
                você terá 5 tentaivas para adivinhar o número.
                
                Boa Sorte!!
                """);

        for (int i = 1; i < 6; i++) {
            System.out.println("Digite sua " + i + " tentativa:");
            numeroDigitado = scan.nextInt();

            if (numeroDigitado > numeroAleatorio) {
                System.out.println("O seu número é maior que o número correto!");
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O seu número é menor que o número correto!");
            } else if (numeroDigitado == numeroAleatorio) {
                System.out.printf("""
                        PARABÉNS!!!
                        Você acertou o número correto!
                        
                        N° Tentativas: %d
                        N° Correto: %d
                        ====================================
                        """, i, numeroAleatorio);
                break;
            }

            if (i == 5) {
                System.out.printf("""
                        QUE PENA!!!
                        Infelizmente você não acertou o número correto!
                        
                        N° Correto: %d
                        ====================================
                        """, numeroAleatorio);
            }
        }

    }
}