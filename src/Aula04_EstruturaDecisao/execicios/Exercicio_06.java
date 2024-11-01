package Aula04_EstruturaDecisao.execicios;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaFinal;

        System.out.println("Digite sua nota ");

        notaFinal = scanner.nextDouble();

        if (notaFinal>0 && notaFinal>=6){
            System.out.println("aprovado");
        }else
            System.out.println("reporvado");
    }
}
