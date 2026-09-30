package br.com.gabriel.zerandosaldo;

public class Saldo {
    double saldo;

    void zerarSaldo() {
        saldo = 0;
        if (saldo == 0) {
            System.out.println("Saldo zerado!!!");
        }
    }

    void exibirSaldo() {
        System.out.printf("Saldo: %.2f\n", saldo);
    }

    static void main(String[] args) {
        Saldo conta = new Saldo();
        conta.saldo = 1500;
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
