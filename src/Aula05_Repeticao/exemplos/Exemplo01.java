package Aula05_Repeticao.exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;  //no while ue necessito atribuir um valor inicial antes de iniciar.

        while (idade<18){
            System.out.print("Digite sua idade");
            idade= scanner.nextInt();
            System.out.println(idade);
        }
        System.out.println("voce é maior de idade");
        scanner.close();
    }
}

