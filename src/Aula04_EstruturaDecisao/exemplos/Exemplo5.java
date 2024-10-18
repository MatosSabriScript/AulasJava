package Aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção");
        System.out.println("\t1- para a opção te amo Sabrina");
        System.out.println("\t2- para a opção gosto da Sabrina");
        System.out.println("\t3- para a opçao Sabrina é diva");

        opcao= scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Você escolheu a opção 1 parabéns");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2 parabéns");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3 parabéns");
                break;
            default:
                System.out.println("Nenhum numero selecionado");
        }
        scanner.close();
    }
}
