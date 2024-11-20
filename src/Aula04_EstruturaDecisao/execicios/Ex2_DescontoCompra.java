package Aula04_EstruturaDecisao.execicios;

import java.util.Scanner;

public class Ex2_DescontoCompra {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        double compra;
        double total;

        System.out.println("Qual é o valor da sua compra?:");
        compra= scanner.nextDouble();

        if (compra>=100) {
            total= compra-(compra *0.1);
            System.out.println("O valor total da sua compra é: "+total);
        }else {
            System.out.println("Não pode acessar o site");

        }
        scanner.close();
    }
}

