package Aula06_Matrizes.exemplos;

public class exemplo_06 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[i][j]);
            }

        }
        String[][] nomes = {{"Niva", "Cida"}, {"Maria", "Nivaldo"}};
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[0].length; j++) {
                System.out.println(nomes[i][j]);
            }

        }
    }
}
