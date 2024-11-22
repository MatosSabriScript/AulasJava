package Aula08_ManipulacaodeArquivos.exemplos;

import java.io.*;

public class Exemplo3_buf {
    public static void main(String[] args) {

        File arquivo = new File("src\\Aula08_ManipulacaodeArquivos\\exemplos\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("Texto gravado novo nesse metodo");
            bufferedWriter.close();

            BufferedReader bufferedReader=new BufferedReader(new FileReader(arquivo));
            String linha;
            while((linha=bufferedReader.readLine())!=null) {
                System.out.println(linha);
            }
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
