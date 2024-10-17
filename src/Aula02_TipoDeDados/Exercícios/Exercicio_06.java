package Aula02_TipoDeDados.Exercícios;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println ("digite um numero : ");
        int numero1 = scanner.nextInt();


        System.out.println ("digite um numero : ");
        int numero2 = scanner.nextInt();

        boolean resposta;

        resposta= numero1>numero2;
        System.out.println(numero1+">"+numero2+"="+resposta);
        resposta= numero1>=numero2;
        System.out.println(numero1+">="+numero2+"="+resposta);



        resposta= numero1<numero2;
        System.out.println(numero1+"<"+numero2+"="+resposta);
        resposta= numero1<=numero2;
        System.out.println(numero1+"<="+numero2+"="+resposta);


    }


}
