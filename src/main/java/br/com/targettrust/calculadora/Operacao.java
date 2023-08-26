package br.com.targettrust.calculadora;

public class Operacao {

        //metodo somar: recebe dois valores inteiros e retorna o resultado da soma destes dois valores
        public static int somar(int numero1, int numero2){
            int resultadoSomar = numero1 + numero2;
            return resultadoSomar;
        }

        //metodo subtrair: recebe dois valores inteiros e retorna o resultado da subtração destes dois valores
        public static int subtrair(int numero1, int numero2){
            int resultadoSubtrair = numero1 - numero2;
            return resultadoSubtrair;
        }

        //metodo dividir: recebe dois valores inteiros e retorna o resultado da divisão destes dois valores
        public static int dividir(int numero1, int numero2){
            int resultadoDividir = numero1 / numero2;
            return resultadoDividir;
        }

        //metodo multiplicar: recebe dois valores inteiros e retorna o resultado da multiplicação destes dois valores
        public static int multiplicar(int numero1, int numero2){
            int resultadoMultiplicar = numero1 * numero2;
            return resultadoMultiplicar;
        }

}
