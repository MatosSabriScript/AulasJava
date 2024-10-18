package Aula04_EstruturaDecisao.exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String corsemaforo;
        System.out.print("Digite a cor do semaforo");
        corsemaforo= scanner.nextLine();

        switch (corsemaforo) {
            case "verde","Verde":
                System.out.println("Siga");
                break;   //break se você tirar ele lê o outro codigo junto "siga e atencao"
            case "amarelo", "Amarelo":
                System.out.println("Atençao");
                break;
            case "vermelho", "Vermelho":
                System.out.println("Pare");
                break;
            default:
                System.out.println("Nunca vi semafor com a cor "+corsemaforo);
        }
        scanner.close();
    }
}
