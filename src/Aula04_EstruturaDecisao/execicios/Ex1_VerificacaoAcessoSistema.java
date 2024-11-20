package Aula04_EstruturaDecisao.execicios;

import java.util.Scanner;

public class Ex1_VerificacaoAcessoSistema {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        int idade;

        System.out.println("Qual a sua idade?:");
        idade= scanner.nextInt();

        if (idade>=18) {
            System.out.println("Você pode acessar o site");
        }else {
            System.out.println("Não pode acessar o site");

        }
        scanner.close();
    }
}



