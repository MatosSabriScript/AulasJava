package Aula07_Funções.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class desafio_2 {
    static Scanner scanner = new Scanner(System.in); //essa variavel todos veem
    static String[] cabecalho = {"id", "Nome", "Telefone", "Email"};
    static String[][] matrizCadastro = {{"", ""}};

    public static void main(String[] args) {
        matrizCadastro[0] = cabecalho;



        String menu = """
                -------------------------------------
                |    Escolha uma opção:             |
                | 1-Exibir Cadastro Completo:       |
                | 2-Inserir Novo Cadastro:          |
                | 3-Atualizar cadastro id           |
                | 4-Deletar um cadastro por id      |
                | 5-Sair                            |
                -------------------------------------
                """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuario();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim de programa!!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);

    }

    public static void exibirUsuario() {
        StringBuilder tabela = new StringBuilder();
        for (String[] linhas : matrizCadastro) {
            for (int coluna = 0; coluna < matrizCadastro[0].length; coluna++) {
                int tamanhoColuna = coluna == 0 ? 5 : (coluna == 2 ? 10 : 25);
                tabela.append(String.format("%-" + tamanhoColuna + "s |", linhas[coluna]));

            }
            tabela.append("\n");
        }
        System.out.println(tabela);

    }


    public static void cadastrarUsuario() {
        System.out.println("Quantos alunos você deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String [][] novaMatriz=new String[matrizCadastro.length+qtdPessoas][cabecalho.length];

        for (int linha = 0; linha < matrizCadastro.length ; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
        }


            System.out.println("Preencha as informações a seguir");
            System.out.println("--------------------------------");

            for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {
                System.out.println(cabecalho[0] + linhas);
                novaMatriz[linhas][0] = String.valueOf(linhas);

                for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                    System.out.println(cabecalho[coluna] + ":-");
                    novaMatriz[linhas][coluna] = scanner.nextLine();

                }

            }
            matrizCadastro=novaMatriz;
        }


    public static void atualizarUsuario() {
        exibirUsuario();

        System.out.println("\nDigite o id do usuario que deseja atualizar: ");
        int idEscolhido=scanner.nextInt();
        scanner.nextLine();

        System.out.println(cabecalho[0] + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.println(cabecalho[coluna] + ":-");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();

        }

    }

    public static void deletarUsuario() {
        exibirUsuario();

        System.out.println("\nDigite o id do usuario que deseja deletar o registro:");
        int idEscolhido=scanner.nextInt();
        scanner.nextLine();

        String [][] novaMatriz=new String[matrizCadastro.length-1][cabecalho.length];
        novaMatriz[0]=cabecalho;
        for (int linha=1,idNovaMatriz=1; linha < matrizCadastro.length ; linha++) {
            if (linha==idEscolhido){
             continue;
         }
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
            novaMatriz[idNovaMatriz] [0]=String.valueOf(idNovaMatriz);
            idNovaMatriz++;
        }
        matrizCadastro=novaMatriz;
        exibirUsuario();
        System.out.println("deletado com sucesso");




    }
}