package Aula06_Matrizes.exercicios;


import java.util.Scanner;

public class Exercicio_02_BuscaDeCaractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] caractere = new String[6];

        caractere[0] = "F";
        caractere[1] = "L";
        caractere[2] = "P";
        caractere[3] = "A";
        caractere[4] = "C";
        caractere[5] = "O";

        System.out.println("digite uma letra em maisuculo ");
        String digitar = scanner.next();

        String verificacao= "Não foi encontrado";



        for (int i = 0; i < caractere.length; i++) {
            if (digitar.equals(caractere[i])){
                verificacao= "O caractere foi encontrado";
            }
        }
        System.out.println(verificacao+" caractere digitado "+digitar);
    }
}
