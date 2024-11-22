package Aula08_ManipulacaodeArquivos.exemplos;

import java.io.File;

import java.io.File;
import java.io.IOException;

public class Exemplo1_fileArquivos {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula08_ManipulacaodeArquivos\\exemplos\\arquivo.txt");

        if (arquivo.exists()) {
            System.out.println("Arquivo já existe");
        } else {
            //cria o arquivo
            try {
                if (arquivo.createNewFile()){
                    System.out.println("arquivo criado com sucesso:"+arquivo.getName());
                }else{
                    System.out.println("Falha ao criar arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
