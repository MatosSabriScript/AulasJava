package Aula02_TipoDeDados.Exercícios;

import java.util.Scanner;

public class Exercicios_08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        float largura;
        float altura;
        float area;

        System.out.println("Digite a largura: ");
        largura= scanner.nextFloat();
        System.out.println("Digite a altura: ");
        altura= scanner.nextFloat();

        area = largura*altura;

        System.out.println("A área total é: "+ area);



    }
}
