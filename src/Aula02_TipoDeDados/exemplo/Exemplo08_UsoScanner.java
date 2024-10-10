package Aula02_TipoDeDados.exemplo;

import java.util.Scanner;

public class Exemplo08_UsoScanner {
    public static void main(String[] args) {
        String  texto = "Amiga Bianca espero que você entenda meu recado \n Volte para o Caio"+
                "\n\tEste texto é para você notar o seu amor linha 3° com tabulação";

        Scanner scanner= new Scanner(System.in);
        System.out.println ("digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); //esse comando serve para cosnumir o /n.
        System.out.println("Digite seu nome: ");
        String nome= scanner.nextLine();

        System.out.println("Seu nome é " + nome +  " e sua idade é " + idade);




        System.out.println(texto);
    }
}
