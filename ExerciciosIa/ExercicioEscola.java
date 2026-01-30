package ExerciciosIa;
import java.util.Scanner;
import java.util.ArrayList;


public class ExercicioEscola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[2];


        while (true) {
            System.out.println("1 - Cadastrar alunos \n" +
                    "2 - Mostrar alunos e média \n" +
                    "3 - Mostrar situação de alunos\n" +
                    "4 - Sair");

            int escolha = sc.nextInt();
            sc.nextLine();

            ArrayList<String> boletim = new ArrayList<>();


            switch (escolha) {
                case 1:
                    while (true) {
                        System.out.println("digite o nome e as notas do aluno ou escreva 'sair' para sair: ");
                        String decisao = sc.nextLine();
                        if (decisao.equalsIgnoreCase("sair")) {
                            break;
                        }
                        for (int i = 0; i < 2; i++) {
                            System.out.println(" digite a " + (i+1) + "º nota:");
                            notas[i] = sc.nextDouble();
                        }
                    boletim.add(decisao + notas[0] + notas[1]);
                    }

                case 2:
                    while (true){
                        System.out.println("1 - exibir alunos cadastrados \n" +
                                "2 - buscar aluno \n" +
                                "3 - sair ");

                        int decisao = sc.nextInt();
                        sc.nextLine();
                        if (decisao == 1){
                            for (int i = 0; i < boletim.size(); i++){
                                System.out.println("nº " + i + "nome: " + boletim);
                            }

                        }
                    }
            }
        }
    }
}
//parei por aqui pq o barato ta doido 15/01/26
//se quiser continuar as instruçoes são essas:

//Ele pode cadastrar alunos
//
//Cada aluno tem:
//
//nome
//
//2 notas
//
//O sistema calcula a média
//
//Diz se o aluno está Aprovado, Recuperação ou Reprovado
//
//Tudo via menu no terminal
//
//====REGRAS DAS NOTAS=====
//
//Média = (nota1 + nota2) / 2
//
//Média ≥ 7 → Aprovado
//
//Média ≥ 5 e < 7 → Recuperação
//
//Média < 5 → Reprovado
//
//====MENU====
//        1 - Cadastrar alunos
//2 - Mostrar alunos e médias
//3 - Mostrar situação dos alunos
//4 - Sair
//
//        (use switch pra tratar o menu)
//
//====ESTRUTURA====
//a estrutura deve usar arrays separados
//
//====DESAFIO OPCIONAL====
//
//Se quiser subir o nível:
//
//Mostre:
//
//maior média
//
//menor média
//
//média geral da turma
//
//Impedir que o usuário veja dados antes de cadastrar alunos