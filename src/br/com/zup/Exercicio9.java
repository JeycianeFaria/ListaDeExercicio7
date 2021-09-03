package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();

        //Variaveis
        int contador = 1;
        int contador2 = 9;
        int qtdDeNumeros = 10;
        int numeroDigitado;

        System.out.println("Digite 10 números");

        while (contador <= qtdDeNumeros) {

            System.out.println("Digite o numero " + contador + " :");
            numeroDigitado = leitor.nextInt();

            listNumber.add(numeroDigitado);

            contador++;

        }

        System.out.println(listNumber.size());

        for (contador = 9; contador >= 0; contador--) {
            System.out.println(listNumber.get(contador));
        }


    }

}
