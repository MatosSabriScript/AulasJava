package Aula05_Repeticao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 20;

        while (idade<18){
            System.out.println(idade);
            System.out.print("Digite sua idade");
            idade= scanner.nextInt();
        }
        System.out.println("voce é maior de idade");
        scanner.close();
    }
}

