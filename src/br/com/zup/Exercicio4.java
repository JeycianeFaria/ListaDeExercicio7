package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int numeroDigitado;
        int contador;
        int numerosDivisores = 0;
        int divisores = 2;

        System.out.println("Digite um número inteiro para verificarmos se ele é um numero primo ou não!");
        numeroDigitado = leitor.nextInt();

        //convertendo números negativos em positivos
        if (numeroDigitado < 0) {
            numeroDigitado = numeroDigitado * -1;
        }


        //Realizando a divisão por todos os números antecessores
        for (contador = 1; contador <= numeroDigitado; contador++) {
            if (numeroDigitado % contador == 0) {
                numerosDivisores++;
            }
        }

        //Fazendo verificação se o número é primo ou não.
        if (numerosDivisores == divisores) {
            System.out.println("O número digitado é um Número Primo");
        } else {
            System.out.println("O número digitado não é um Número Primo");
        }

    }

}
