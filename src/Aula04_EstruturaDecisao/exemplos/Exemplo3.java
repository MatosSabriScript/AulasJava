package Aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner( System.in);

        System.out.println("Qual a sua idade?: ");
        idade = scanner.nextInt();


        if ( idade >0 && idade <= 12) {
            System.out.println("Criança");
        } else if ( idade >12 && idade <= 17) {
            System.out.println("Adoslecente");
        } else if ( idade >17 && idade <= 64) {
            System.out.println("Adulto");
        } else if ( idade >64 ) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade invalida");
        }
        }
    }





