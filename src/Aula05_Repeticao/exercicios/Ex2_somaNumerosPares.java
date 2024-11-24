package Aula05_Repeticao.exercicios;

public class Ex2_somaNumerosPares {
    public static void main(String[] args) {
        int par = 1;
        int soma = 0;

        while (par <= 100) {
            if (par % 2 == 0) {
                soma += par;
            }
            par++;

        }
        System.out.println("A soma dos numeros pares de 1 a 100 é: " + soma);
    }
}
