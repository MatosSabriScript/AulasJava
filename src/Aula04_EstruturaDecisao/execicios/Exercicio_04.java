package Aula04_EstruturaDecisao.execicios;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção");
        System.out.println("\t1- para a opção Eletronico");
        System.out.println("\t2- para a opção Alimento");
        System.out.println("\t3- para a opçao Vestuario");

        opcao= scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Você escolheu a opção 1 Eletronico");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2 Alimento");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3 Vestuario");
                break;
            default:
                System.out.println("Nenhum numero selecionado");
        }
        scanner.close();
    }
}



