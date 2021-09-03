package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LevelUp {

    public static void main(String[] args) {

        //instanciando as estruturas.
        Scanner leitor = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<String, String>();

        //Variáveis
        String nomeDoAluno;
        String telefoneDoAluno;
        String emailDoAluno;
        boolean entradaMenu = true;
        int opcoesMenu = 0;


        //Menu
        while (entradaMenu) {
            System.out.println("O que você gostaria de fazer?");
            System.out.println("1- Cadastrar Aluno");
            System.out.println("2- Sair");
            opcoesMenu = leitor.nextInt();

            //Decisões do usuário
            if (opcoesMenu == 1) {

                //Recebendo dados do usuário.
                System.out.println("------Sistema De Cadastro do Aluno------");
                System.out.println("Digite o nome completo do aluno:");
                nomeDoAluno = leitor.nextLine();
                System.out.println("Digite o telefone do aluno:");
                telefoneDoAluno = leitor.nextLine();
                System.out.println("Digite o e-mail do aluno:");
                emailDoAluno = leitor.nextLine();

                //cadastrando aluno na lista
                alunos.put(emailDoAluno, " Nome: " + nomeDoAluno + " // Telefone: " + telefoneDoAluno);

            } else if (opcoesMenu == 2) {

                entradaMenu = false;

            } else {

                System.out.println("Valor inválido, digite novamente!");

            }
        }

        //imprimindo na tele
        System.out.println(alunos);

    }

}
