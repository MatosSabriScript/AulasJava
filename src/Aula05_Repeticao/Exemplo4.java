package Aula05_Repeticao;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escolha um numero para calcular a tabuada");

        int x= scanner.nextInt();

        //System.out.println(x+"2x0="+ x*0);
        //System.out.println(x+"2x0="+ x*1);
        //System.out.println(x+"2x0="+ x*2);
        //System.out.println(x+"2x0="+ x*3);

        for (int multiplicador = 0; multiplicador <=10 ; multiplicador++) {
            System.out.println(x+"x"+multiplicador+"="+x*multiplicador);

        }




    }
}


