package Aula02_TipoDeDados.exemplo;
import  java.util.Scanner;

public class Exemplo6_CastingImplicito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digitar um número inteiro: ");

        int varInt = scanner.nextInt();
        long varLong = varInt; float varFloat = varInt;

        System.out.print("O número inteiro digitado é: " + varInt);
        System.out.println("varlong = "+varLong);
        System.out.println("varfloat = "+varFloat);
        System.out.print("Digitar um número decimal: ");        varFloat = scanner.nextFloat();
        System.out.print("O número decimal digitado é: " + varFloat);scanner.close();    }}

