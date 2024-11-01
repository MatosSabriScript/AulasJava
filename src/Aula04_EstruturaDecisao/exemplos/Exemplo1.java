package Aula04_EstruturaDecisao.exemplos;


import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("digite um numero inteiro");
        x= scanner.nextInt();

        if (x>=30) {                        // a chave agrupa o  codigo de código do if
            System.out.println("O número é maior ou igual a 30");
                                            //.out.println("teste");
        }else {
            System.out.println("o número é menor que 30");

        }
        scanner.close();
        }
    }

