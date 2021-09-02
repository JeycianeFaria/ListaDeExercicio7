package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Variaveis
        double produto1;
        double produto2;
        double produto3;


        System.out.println("Vamos descobrir qual o produto mais barato para comprarmos!");
        System.out.println("Por favor, digite o valor do produto 1");
        produto1 = leitor.nextDouble();
        System.out.println("Agora digite o valor do produto 2");
        produto2 = leitor.nextDouble();
        System.out.println("E agora  o valor do produto 3");
        produto3 = leitor.nextDouble();

        if (produto1 < produto2 & produto1 < produto3) {
            System.out.println("Você deve comprar o produto 1.");
            System.out.println("Pois ele é o mais barato custando R$" + produto1);
        } else if (produto2 < produto1 & produto2 < produto3) {
            System.out.println("Você deve comprar o produto 2.");
            System.out.println("Pois ele é o mais barato custando R$" + produto2);
        } else {
            System.out.println("Você deve comprar o produto 3.");
            System.out.println("Pois ele é o mais barato custando R$" + produto3);
        }

    }

}
