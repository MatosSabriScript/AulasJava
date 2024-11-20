package Aula07_Funções.exercicios;

import java.util.Scanner;

public class Ex3_DobrodeNumero {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1= scanner.nextInt();

        int dobro= dobrar (numero1);
        System.out.println("O valor é "+dobro);
        scanner.close();

    }
     public static int dobrar (int numero1){
        return 2*numero1;

     }
}
