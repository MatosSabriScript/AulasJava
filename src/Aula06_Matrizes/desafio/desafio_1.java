package Aula06_Matrizes.desafio;

import java.util.Scanner;

public class desafio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos você deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"id", "Nome", "Telefone", "Email"};
        String[][] matrizCadastro = new String[qtdPessoas +1][cabecalho.length];
        matrizCadastro[0] = cabecalho;

        for (int linhas = 1; linhas <= qtdPessoas; linhas++) {
            System.out.println("ID- " + linhas);
            matrizCadastro[linhas][0] = String.valueOf(linhas);//converte o número em uma String;
            System.out.println("Nome: " );
            matrizCadastro[linhas][1] = scanner.nextLine();
            System.out.println("telefone: " );
            matrizCadastro[linhas][2] = scanner.nextLine();
            System.out.println("Email: ");
            matrizCadastro[linhas][3] = scanner.nextLine();
        }
        String tabela="";
        for (String[] linhas : matrizCadastro) {
            for (int coluna=0; coluna<matrizCadastro[0].length; coluna++ ) {
                tabela +=linhas [coluna] + "\t\t";

            }
            tabela+= "\n";
        }
        System.out.println(tabela);
    }
}