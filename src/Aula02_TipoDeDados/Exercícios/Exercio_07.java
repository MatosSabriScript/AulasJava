package Aula02_TipoDeDados.Exercícios;

public class Exercio_07 {
    public class OperadoresLogicos {
        public static void main(String[] args) {
            boolean cond1 = true;
            boolean cond2 = false;
            boolean cond3 = true;

            boolean resultadoAND = cond1 && cond2 && cond3; // AND (E)
            boolean resultadoOR = cond1 || cond2 || cond3;  // OR (OU)

            // Exibindo os resultados no console
            System.out.println("Resultado do operador AND (&&): " + resultadoAND);
            System.out.println("Resultado do operador OR (||): " + resultadoOR);
        }
    }
}


