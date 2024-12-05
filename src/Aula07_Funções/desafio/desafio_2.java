package Aula07_Funções.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class desafio_2 {
     static Scanner scanner=new Scanner(System.in); //essa variavel todos veem
    static String[] cabecalho = {"id", "Nome", "Telefone", "Email"};
     static String[][] matrizCadastro = {{"",""}};

    public static void main(String[] args) {
        matrizCadastro[0] = cabecalho;
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }

    public static void exibirUsuario() {
        String tabela="";
        for (String[] linhas : matrizCadastro) {
            for (int coluna=0; coluna<matrizCadastro[0].length; coluna++ ) {
                tabela +=linhas [coluna] + "\t\t";

            }
            tabela+= "\n";
        }
    }

    public static void cadastrarUsuario() {
        System.out.println("Quantos alunos você deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String [][] novaMatriz=new String[matrizCadastro.length][cabecalho.length];

        for (int linha = 0; linha < matrizCadastro.length ; linha++) {
            novaMatriz[linha]= Arrays.copyOf(matrizCadastro[linha],matrizCadastro[linha].length);
        }

        System.out.println("Preencha as informações a seguir");
        System.out.println("--------------------------------");

        for (int linhas = matrizCadastro.length; linhas <novaMatriz.length ; linhas++) {
            System.out.println(cabecalho[0] + "-"+linhas);
            novaMatriz[linhas][0]=String.valueOf(linhas);

            for (int coluna = 1; coluna < cabecalho.length ; coluna++) {
                System.out.println(cabecalho[coluna]+":-");
                novaMatriz[linhas][coluna] = scanner.nextLine();

            }

        }

    }

    public static void atualizarUsuario() {
        System.out.println("Atualizar");
    }

    public static void deletarUsuario() {
        System.out.println("Deletar");
    }
}