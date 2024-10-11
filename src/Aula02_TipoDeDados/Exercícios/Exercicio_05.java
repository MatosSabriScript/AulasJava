package Aula02_TipoDeDados.Exercícios;
import java.util.Scanner;



public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println ("digite sua nota 1: ");
        int nota1 = scanner.nextInt();


        System.out.println ("digite sua nota 2: ");
        int nota2 = scanner.nextInt();


        System.out.println ("digite sua nota 3: ");
        int nota3 = scanner.nextInt();


        int total;

        total= (nota1+nota2+nota3);

        System.out.println("Sua nota é de:"+ total);











    }
}
