package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaNumerosPar = new ArrayList<>();
        List<Integer> listaNumerosImpar = new ArrayList<>();
<<<<<<< HEAD
=======


        //variaveis
        int qtdNumeros = 20;
        int numeroDigitado;

        System.out.println("Por favor digite " + qtdNumeros +  " números inteiros!");

        for (int contador = 1; contador <= 20; contador++){

            System.out.println("Digite o número " + contador + ": ");
            numeroDigitado = leitor.nextInt();

            listaNumeros.add(numeroDigitado);
        }

        for (int contador = 0; contador < listaNumeros.size(); contador++){
            if (listaNumeros.get(contador) % 2 == 0){
                listaNumerosPar.add(listaNumeros.get(contador));
            }else {
                listaNumerosImpar.add(listaNumeros.get(contador));
            }
        }


        //imprimindo
        System.out.println("A lista de numeros digitados é a seguinte:");
        System.out.println(listaNumeros);
        System.out.println("Os números pares digitados são: ");
        System.out.println(listaNumerosPar);
        System.out.println("Os números ímpares digitados são: ");
        System.out.println(listaNumerosImpar);


>>>>>>> acc363d (Resolução do Exercicio 11  da Lista 7)


        //variaveis
        int qtdNumeros = 20;
        int numeroDigitado;

        System.out.println("Por favor digite " + qtdNumeros +  " números inteiros!");

        for (int contador = 1; contador <= 20; contador++){

            System.out.println("Digite o número " + contador + ": ");
            numeroDigitado = leitor.nextInt();

            listaNumeros.add(numeroDigitado);
        }

        for (int contador = 0; contador < listaNumeros.size(); contador++){
            if (listaNumeros.get(contador) % 2 == 0){
                listaNumerosPar.add(listaNumeros.get(contador));
            }else {
                listaNumerosImpar.add(listaNumeros.get(contador));
            }
        }


        //imprimindo
        System.out.println("A lista de numeros digitados é a seguinte:");
        System.out.println(listaNumeros);
        System.out.println("Os números pares digitados são: ");
        System.out.println(listaNumerosPar);
        System.out.println("Os números ímpares digitados são: ");
        System.out.println(listaNumerosImpar);

    }
}
