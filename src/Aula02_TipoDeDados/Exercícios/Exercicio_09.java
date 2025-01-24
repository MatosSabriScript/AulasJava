package Aula02_TipoDeDados.Exercícios;

public class Exercicio_09 {
    public static void main(String[] args) {
         // Declarando uma variável float com valor fracionado
                float valorFloat = 12.34f;

                // Declarando uma variável long e atribuindo o valor do float (casting explícito)
                long valorLong = (long) valorFloat;

                // Declarando uma variável double e atribuindo o valor do long (casting implícito)
                double valorDouble = valorLong;

                // Exibindo os valores no console
                System.out.println("Valor do float: " + valorFloat);
                System.out.println("Valor do long (após casting explícito): " + valorLong);
                System.out.println("Valor do double (após casting implícito): " + valorDouble);
            }
        }

