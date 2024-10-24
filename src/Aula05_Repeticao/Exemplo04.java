package Aula05_Repeticao;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("escolha uma opção");
            System.out.println("Escolha uma opção");
            System.out.println("\t1- para a opção te amo Sabrina");
            System.out.println("\t2- para a opção gosto da Sabrina");
            System.out.println("\t3- para a opçao Sabrina é diva");
            System.out.println("\t4- para a opçao Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1 parabéns");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2 parabéns");
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3 parabéns");
                    break;
                case 4:
                    System.out.println("Tchau");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=4);
        System.out.println("Fim do programa");
        scanner.close();

    }
}