package Aula07_Funções.exercicios;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1= scanner.nextInt();
        System.out.println("Digite um numero: ");
        int numero2= scanner.nextInt();
        int soma= continha (numero1,numero2);
        System.out.println("O valor é "+soma);

    }
     public static int continha (int numero1, int numero2){
        return numero1+numero2;

     }
}
