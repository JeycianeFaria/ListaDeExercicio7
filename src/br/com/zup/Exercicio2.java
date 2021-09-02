package br.com.zup;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variaveis
        int numeroDigitado;

        System.out.println("Olá, escolha o dia que deseja selecionar de acrodo com o menu a seguir: ");
        System.out.println("1- Domingo");
        System.out.println("2- Segunda-feira");
        System.out.println("3- Terça-feira");
        System.out.println("4- Quarta-feira");
        System.out.println("5- Quinta-feira");
        System.out.println("6- Sexta-feira");
        System.out.println("7- Sábado");


        System.out.println("Digite o número correspondente: ");
        numeroDigitado = leitor.nextInt();


        switch (numeroDigitado) {
            case 1:
                System.out.println("O dia selecionado foi o Domingo!");
                break;
            case 2:
                System.out.println("O dia selecionado foi a Segunda-feira!");
                break;
            case 3:
                System.out.println("O dia selecionado foi a Terça-feira!");
                break;
            case 4:
                System.out.println("O dia selecionado foi a Quarta-feira!");
                break;
            case 5:
                System.out.println("O dia selecionado foi a Quinta-feira!");
                break;
            case 6:
                System.out.println("O dia selecionado foi a Sexta-feira!");
                break;
            case 7:
                System.out.println("O dia selecionado foi o Sábado");
                break;
            default:
                System.out.println("Valor digitado inválido!");
        }

    }

}
