package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List <Integer> listNumber = new ArrayList<>();

        //variáveis
        int contador = 1;
        int numeroDigitado;
        int qtdDeNumeros = 5;

        while (contador <= qtdDeNumeros){

            System.out.println("Digite o numero  " + contador + " :");
            numeroDigitado = leitor.nextInt();

            listNumber.add(numeroDigitado);

            contador++;
        }

        System.out.println(listNumber);

    }

}
