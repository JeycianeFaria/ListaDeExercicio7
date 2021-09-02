package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variáveis
        int numeroDigitado;
        int contador = 1;
        int qtdDeNumeros = 10;
        int multiplicação;

        //Recebendo dados usuário
        System.out.println("Digite o numero de 1 a 10 que você quer a tabuada: ");
        numeroDigitado = leitor.nextInt();

        //verificando número digitado
        if (numeroDigitado >= 1 & numeroDigitado <= 10){

            System.out.println("Tabuada do " + numeroDigitado + ":");

            //Tabuada dinamica com a estrutura de repetição
            while(contador <= qtdDeNumeros){

                multiplicação = contador * numeroDigitado;
                System.out.println(numeroDigitado + " x " + contador + " = " + multiplicação);

                contador++;

            }

        }else{
            System.out.println("Valor digitado inválido");
        }

    }

}
