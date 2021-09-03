package br.com.zup;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Variaveis
        int primeiroNumero;
        int segundoNumero;
        int contador;

        //recebendo dados do usuário
        System.out.println("Por favor, digite um número inteiro: ");
        primeiroNumero = leitor.nextInt();
        System.out.println("Digite outro número inteiro: ");
        segundoNumero = leitor.nextInt();

        System.out.println("Estes são todos os numeros inteiros, dentro do intervalo compreendido");

        //Estrutura de repetições de acordo com qual dos numeros for maior
        if (primeiroNumero <= segundoNumero){

            for (contador = primeiroNumero; contador <= segundoNumero;contador++){


                System.out.println(contador);

            }

        }else{

            for (contador = segundoNumero; contador <= primeiroNumero;contador++){

                System.out.println(contador);

            }

        }


    }

}
