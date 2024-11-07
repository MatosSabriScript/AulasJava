package Aula06_Matrizes.exemplos;

public class exemplo_02 {
    public static void main(String[] args) {
        int [][] matriz = new int [2][3]; //Cria uma matriz com 2 linhas e 3 colunas

        matriz [0] [0]=1;
        matriz [0] [1]=2;
        matriz [0] [2]=3;
        matriz [1] [0]=4;
        matriz [1] [1]=5;
        matriz [1] [2]=6;


        //Acessando os valore da matriz

        System.out.println("Elemento na posição [0][2]=" + matriz [0][2]);

        String [][] matriznomes = new String [2][2];

        matriznomes [0][0]= "Samuel";
        matriznomes [0][1]= "Sabrina";
        matriznomes [1][0]= "Gabriel";
        matriznomes [1][1]= "Maria";

        System.out.println("Valor da  matriz na posição [1][1]= "+ matriznomes[1][1]);




    }
}
