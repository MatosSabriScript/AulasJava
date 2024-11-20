package Aula07_Funções.exercicios;

import java.util.Scanner;

public class Ex4_CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite um temperatura em Celsius: ");
        double c= scanner.nextDouble();
        double f= converterCelsiusParaFahrenheit (c);
        System.out.println("O valor é "+f);
        scanner.close();

    }
     public static double converterCelsiusParaFahrenheit (double c){
         double f;
         return f= (c*1.8+32);

     }
}
