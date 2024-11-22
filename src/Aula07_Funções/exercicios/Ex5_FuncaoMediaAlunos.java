package Aula07_Funções.exercicios;

import java.util.Scanner;

public class Ex5_FuncaoMediaAlunos {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite 1° nota: ");
        double numero1= scanner.nextDouble();
        System.out.println("Digite 2° nota:  ");
        double numero2= scanner.nextDouble();
        System.out.println("Digite 3° nota: ");
        double numero3= scanner.nextDouble();

        double media= calcularMedia (numero1,numero2,numero3);
        System.out.println("O valor da sua média é:  "+media);
        scanner.close();

    }
     public static double calcularMedia (double numero1, double numero2, double numero3) {
         return (numero1 + numero2 + numero3) / 3;

     }
}
