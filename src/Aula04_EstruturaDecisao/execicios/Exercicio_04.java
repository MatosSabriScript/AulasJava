package Aula04_EstruturaDecisao.execicios;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double valorTotal;

        System.out.println("Olá seja bem-vindo: Qual foi o valor de vendas realizadas ?");
        x = scanner.nextDouble();

        if (x > 0 && x <1000) {
            valorTotal = (x * 0.05);
            System.out.printf("O valor da sua comissão é %f2 " ,valorTotal);
        } else if (x >= 1000 && x<= 5000) {
            valorTotal = (x * 0.10);
            System.out.println("O valor da sua comissão é " + valorTotal);
        } else if (x > 5000) {
            valorTotal = (x * 0.15);
            System.out.println("O valor da sua comissão é " + valorTotal);
        } else {
            System.out.println("o valor não corresponde");
        }
        scanner.close();
    }
}


//pesquisar sobre printf para formatar esse números



           
       


            