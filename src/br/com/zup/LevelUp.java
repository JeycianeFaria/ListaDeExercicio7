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
        String emailDoAluno;
        String emailASerDeletado;
        String emailDeletado = "";
        String nomeDoAluno;
        String telefoneDoAluno;
        boolean entradaMenu = true;
        int opcoesMenu = 0;


        //Menu
        while (entradaMenu) {
            System.out.println("O que você gostaria de fazer?");
            System.out.println("1- Cadastrar Aluno");
            System.out.println("2- Exibir lista de alunos cadastrados");
            System.out.println("3- Excluir alunos");
            System.out.println("4- Sair");
            opcoesMenu = leitor.nextInt();
            leitor.nextLine();  //para o programa ler o enter.

            //Decisões do usuário
            if (opcoesMenu == 1) {
                //Recebendo dados do usuário para cadastrar!
                System.out.println("------Sistema De Cadastro do Aluno------");
                System.out.println("Digite o nome completo do aluno:");
                nomeDoAluno = leitor.nextLine();
                System.out.println("Digite o telefone do aluno:");
                telefoneDoAluno = leitor.nextLine();
                System.out.println("Digite o e-mail do aluno:");
                emailDoAluno = leitor.nextLine();

                //verificar se email já foi cadastrado
                if (alunos.size() != 0) {

                    boolean alunoExiste = false;

                    for (String verificarChave : alunos.keySet()) {

                        if (verificarChave.equals(emailDoAluno)) {

                            alunoExiste = true;
                        }else{
                            alunoExiste = false;
                        }

                    }

                    if(alunoExiste){
                        System.out.println("Este email já foi cadastrado");
                    }else{
                        //cadastrando aluno na lista
                        alunos.put(emailDoAluno, " Nome: " + nomeDoAluno + "  Telefone: " + telefoneDoAluno);
                        System.out.println("Aluno cadastrado com sucesso! \n" );
                    }


                } else {

                    //cadastrando aluno na lista
                    alunos.put(emailDoAluno, " Nome: " + nomeDoAluno + "  Telefone: " + telefoneDoAluno);
                    System.out.println("Aluno cadastrado com sucesso! \n");

                }

            } else if (opcoesMenu == 2) {

                //exibir a lista
                System.out.println("Esta é a lista de todos os alunos cadastrados até o momento");
                for (String chaveAluno : alunos.keySet()) {
                    System.out.println("Aluno -  " + alunos.get(chaveAluno) + " Email: " + chaveAluno);
                }
                System.out.println();

            } else if (opcoesMenu == 3) {

                //excluir aluno
                System.out.println("Digite o email do aluno a ser excluido");
                emailASerDeletado = leitor.nextLine();

                for (String emailExcluir : alunos.keySet()) {

                    if (emailExcluir.contains(emailASerDeletado)) {
                        emailDeletado = emailASerDeletado;
                        //break;
                    }

                }

                if(emailDeletado.equals("")){

                    System.out.println("Email não encontrado");

                } else {
                    alunos.remove(emailASerDeletado);
                    System.out.println("Aluno excluído com sucesso!");
                }


            } else if (opcoesMenu == 4) {

                entradaMenu = false;

            } else {

                System.out.println("Valor inválido, digite novamente!");

            }

        }

    }

}
