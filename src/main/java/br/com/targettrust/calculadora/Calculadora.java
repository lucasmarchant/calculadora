package br.com.targettrust.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Operacao operacao = new Operacao();

        Tela tela = new Tela();

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.printf("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int resultadoSoma = Operacao.somar(valor1, valor2);
        Tela.exibirSoma(resultadoSoma);

        int resultadoSubtracao = Operacao.subtrair(valor1, valor2);
        Tela.exibirSubtração(resultadoSubtracao);

        int resultadoDivisao = Operacao.dividir(valor1,valor2);
        Tela.exibirDivisao(resultadoDivisao);

        int resultadoMultiplicacao = Operacao.multiplicar(valor1,valor2);
        Tela.exibirMultiplicacao(resultadoMultiplicacao);

    }

}
