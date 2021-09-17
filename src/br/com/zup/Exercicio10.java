package br.com.zup;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variáveis
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double soma;
        double media;


        System.out.println("-----CALCULANDO A MÉDIA-----");
        System.out.println("Por favor digite as notas: ");
        System.out.println("Nota 1: ");
        nota1 = leitor.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = leitor.nextDouble();
        System.out.println("Nota 3: ");
        nota3 = leitor.nextDouble();
        System.out.println("Nota 4: ");
        nota4 = leitor.nextDouble();


        //calculos
        soma = nota1 + nota2 + nota3 + nota4;
        media = soma/4;

        //impimindo
        System.out.println("Suas notas foram as seguintes: ");
        System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3 + "\nNota 4: " + nota4);
        System.out.println("E sua média foi nota " + media);

    }

}
