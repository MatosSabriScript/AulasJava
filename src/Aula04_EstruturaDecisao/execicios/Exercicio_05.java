package Aula04_EstruturaDecisao.execicios;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasTrabalhadas;
        double valorHora;
        double valorHoraExtra;
        int qtdHoraExtra;

        System.out.println("Olá seja bem-vindo: Qual foi o valor da hora trabalhada ?");
        valorHora = scanner.nextDouble();

        System.out.println("Olá seja bem-vindo: Qual foi o total de horas trabalhadas?");
        horasTrabalhadas = scanner.nextInt();

        if (horasTrabalhadas >0 && horasTrabalhadas >= 40){
            qtdHoraExtra= horasTrabalhadas-40;
            valorHoraExtra= qtdHoraExtra *(valorHora*0.5+valorHora);
            System.out.println("seu valor a receber é "+valorHoraExtra);
        }else
            System.out.println("Você não tem direito a hora extra");








    }
}
