package Aula02_TipoDeDados.exemplo;

public class Exemplo4_OperadoresLogicosDeComparacoes {
    public static void main(String[] args) {
        int num1=2, num2=5,num3=2, num4=1;
        boolean resposta;

        resposta=num1<num2 && num3!=num4;


        System.out.println(num1+ "< "+num2+ " && "+num3+ " !=" +num4+ "=" +resposta);

        resposta=num1<num2 || num3!=num4;
        System.out.println(num1+ "< "+num2+ "||"+num3+ " !=" +num4+ "=" +resposta);


        resposta= !(num1==num2); //inverte a resposta,porém ela tem que ser boolean o dado
        System.out.println(num1+ "=="+num2+ "="+ resposta);



    }
}
