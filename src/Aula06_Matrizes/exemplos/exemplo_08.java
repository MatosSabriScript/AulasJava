package Aula06_Matrizes.exemplos;

public class exemplo_08 {
    public static void main(String[] args) {
        int[][] numeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int [] numero:numeros) {   //não pode ter o mesmo nome aqui
            for (int i : numero) {
                System.out.println(i);
            }

        }
        String[][] nomes = {{"Niva", "Cida"}, {"Maria", "Nivaldo"}};
        for (String[] nome : nomes) {
            for (int j = 0; j < nomes[0].length; j++) {
                System.out.println(nome[j]);
            }

        }
    }
}
