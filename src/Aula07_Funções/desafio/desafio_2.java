package Aula07_Funções.desafio;

import java.util.Scanner;

public class desafio_2 {
    public static void main(String[] args) {
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
        System.out.println("Exibir");
    }

    public static void cadastrarUsuario() {
        System.out.println("Cadastrar");
    }

    public static void atualizarUsuario() {
        System.out.println("Atualizar");
    }

    public static void deletarUsuario() {
        System.out.println("Deletar");
    }
}