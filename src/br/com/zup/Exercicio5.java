package br.com.zup;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Variáveis
        int contador = 1;
        int qtdDeNumeros = 5;
        double maiorNumero = 0;
        double numeroDigitado;


        while(contador <= qtdDeNumeros){

            System.out.println("Digite o numero " + contador + " :");
            numeroDigitado = leitor.nextDouble();

            if (contador == 1){
                maiorNumero = numeroDigitado;
            }
            if (numeroDigitado > maiorNumero){
                maiorNumero = numeroDigitado;
            }

            contador++;
        }

        System.out.println("O maio numero digitado foi o " + maiorNumero);

    }

}
