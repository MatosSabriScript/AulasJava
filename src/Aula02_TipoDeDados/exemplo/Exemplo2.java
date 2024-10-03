package Aula02_TipoDeDados.exemplo;

public class Exemplo2 {
    public static void main(String[] args) {
        int numero1=2, numero2=4;
        float total;

        total=numero1 + numero2;
        System.out.println("A soma dos números é:= "+total);
        total=numero1 - numero2;
        System.out.println("A subtração dos números é:= "+total);
        total=numero1 * numero2;
        System.out.println("A multiplicação dos números é:= "+total);


        //mesmo um numéro sendo inteiro e outro float, ele sempre vai obdecer o numero maior da mémoria float>int
        float totalfloat, numero1float=2;
        totalfloat=numero1float / numero2;
        System.out.println("A divisão dos números é:= "+totalfloat);

        float modulo= numero1float % numero2;
        System.out.println("O resto da divisão "+ numero1float+  " por " + numero2+ " é igual a " +modulo);

    }
}
