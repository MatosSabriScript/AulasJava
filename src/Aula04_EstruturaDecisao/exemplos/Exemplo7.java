package Aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float valorFinal=0;
        float desconto= 0.2f;

        System.out.println("Digite o valor da compra. ");

        float valorCompra= scanner.nextFloat();
        valorFinal= valorCompra > 100.0f ? valorCompra-(valorCompra*desconto):valorCompra;

        System.out.println("valor da compra é "+valorFinal);
        scanner.close();

    }
}

