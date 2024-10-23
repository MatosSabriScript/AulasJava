package Aula05_Repeticao;

import java.util.Scanner;

public class Exemplo5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int idade;

            do{
                System.out.print("Digite sua idade");
                idade= scanner.nextInt();
                System.out.println(idade);
            } while (idade<18); //ponto é virgula não vai no while sozinho.
            System.out.println("voce é maior de idade");
            scanner.close();

        }
    }

