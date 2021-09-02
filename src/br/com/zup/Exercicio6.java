package br.com.zup;

public class Exercicio6 {

    public static void main(String[] args) {

        //Variaveis
        int contador = 0;
        int ultimoNumero = 50;
        int numeroImpar = 0;

        while(contador <= ultimoNumero){
            if (contador % 2 != 0){
                numeroImpar = contador;
                System.out.println(numeroImpar);
            }
            contador++;
        }

    }

}
