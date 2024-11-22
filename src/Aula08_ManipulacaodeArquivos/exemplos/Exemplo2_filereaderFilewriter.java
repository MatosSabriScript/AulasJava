package Aula08_ManipulacaodeArquivos.exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo2_filereaderFilewriter {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula08_ManipulacaodeArquivos\\exemplos\\arquivo.txt");

        try {
            FileWriter fileWriter= new FileWriter(arquivo);
            fileWriter.write("Texto a ser gravado no arquivo");
            fileWriter.close();

            FileReader fileReader=new FileReader(arquivo);
            int caractere;
           while ((caractere= fileReader.read())!=-1){
               System.out.print((char)caractere);
            }
            fileReader.close();
            //System.out.println((char)caractere);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
