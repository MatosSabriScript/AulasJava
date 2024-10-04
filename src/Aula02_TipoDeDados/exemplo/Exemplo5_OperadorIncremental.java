package Aula02_TipoDeDados.exemplo;

public class Exemplo5_OperadorIncremental {
    public static void main(String[] args) {

        //atribuição
        int num1 = 0;

        num1++;
        System.out.println("num1 = " + num1); // num1 agora é 1

        num1 += 20;
        System.out.println("num1 += 20 = " + num1); // num1 agora é 21

        num1--;
        System.out.println("num1-- = " + num1); // num1 agora é 20

        num1 -= 12;
        System.out.println("num1 -= 12 = " + num1); // num1 agora é 8

        num1 *= 2;
        System.out.println("num1 *= 2 = " + num1); // num1 agora é 16

        num1 /= 2;
        System.out.println("num1 /= 2 = " + num1); // num1 agora é 8

        int num2=0;
        System.out.println("num2= "+num2);

        num2= num1++;
        System.out.println("antes num2 = num1++ depois num2 ="+num2+ "num1 =" +num1);

        num2= ++num1;
        System.out.println("antes num2 = ++num1 depois num2 ="+num2+  "num1 ="  +num1);








    }
}
