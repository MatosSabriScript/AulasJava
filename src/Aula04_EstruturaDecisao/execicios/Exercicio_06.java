package Aula04_EstruturaDecisao.execicios;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaFinal;

        System.out.println("Digite sua nota ");

        notaFinal = scanner.nextDouble();

        if ( notaFinal>0 && notaFinal<5) {
            System.out.println("Reprovada");
        } else if ( notaFinal>=5 && notaFinal <7) {
            System.out.println("Recuperação");
        } else if ( notaFinal>=7 && notaFinal <= 10) {
            System.out.println("Aprovada");
        } else {
            System.out.println("Nota invalida");
        }
    }
}
