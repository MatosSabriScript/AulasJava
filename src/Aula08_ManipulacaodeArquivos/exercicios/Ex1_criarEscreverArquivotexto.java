package Aula08_ManipulacaodeArquivos.exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1_criarEscreverArquivotexto {
    public static void main(String[] args) {

        File arquivo = new File("C:\\Users\\Aluno\\Documents\\Sabrina\\src\\Aula08_ManipulacaodeArquivos\\exercicios\\alunos.txt");
        Scanner scanner = new Scanner(System.in);


        try (FileWriter fileWriter = new FileWriter(arquivo, true)) { // true para adicionar ao arquivo
            for (int i = 0; i < 5; i++) {
                System.out.println("Aluno " + (i + 1) + ":");
                String aluno = scanner.nextLine();
                fileWriter.write(aluno + "\n"); // Escreve o nome do aluno no arquivo
            }
            System.out.println("Os nomes dos alunos foram gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
