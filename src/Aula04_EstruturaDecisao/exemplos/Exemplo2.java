package Aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        String corSemaforo;

        Scanner scanner= new Scanner( System.in);
        System.out.println("digite a cor do semaforo");
        corSemaforo=scanner.next();

        if (corSemaforo.equals  ("verde")|| corSemaforo.equals ("Verde")) {
            System.out.println("Siga!");
        } else if (corSemaforo.equals("amarelo") || corSemaforo.equals ("Amarelo")) {
            System.out.println("Atenção");
        } else if (corSemaforo.equals("vermelho") || corSemaforo.equals ("Vemelho")) {
            System.out.println("Pare agora!!!");
        } else {
            System.out.println("Nunca vi semaforo com a cor "+ corSemaforo);
        }
        scanner.close();
        {

        }
    }
}
