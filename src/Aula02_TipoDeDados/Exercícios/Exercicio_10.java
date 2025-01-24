package Aula02_TipoDeDados.Exercícios;

public class Exercicio_10 {
    public static void main(String[] args) {
        short valor= 170;

        int valorInt = valor;

        byte valorByte= (byte) valorInt;

        System.out.println("Valor do casting implicito "+valorInt);
        System.out.println("Valor do casting explicito "+valorByte);


    }
}
