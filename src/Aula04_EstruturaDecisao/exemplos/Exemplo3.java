package Aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner( System.in);

        System.out.println("Qual a sua idade?: ");
        idade = scanner.nextInt();


        if (idade <= 12){
            System.out.println("Criança");
        } else if (idade<=17) {
            System.out.println("Adolescente");
            
        }


    }
}
