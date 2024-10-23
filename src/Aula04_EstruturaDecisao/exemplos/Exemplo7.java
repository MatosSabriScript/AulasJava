package Aula04_EstruturaDecisao.exemplos;

public class Exemplo7 {
    public static void main(String[] args) {

        float valorCompra= 150.50f;
        float desconto= 0.2f;
        float valorFinal;

        valorFinal= valorCompra > 100.0f ? valorCompra-(valorCompra*desconto):valorCompra;

        System.out.println("valor da compra é "+valorFinal);


    }
}

