package AtividadesJavaIf;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[3];

        for (int i = 0; i <= 2; i++) {
            System.out.print("Escreva seu " + (i + 1) + " numero: ");
            numero[i] = scanner.nextInt();
        }

        boolean primeiroEMaior = numero[0] >= numero[1] && numero[0] > numero[2];
        boolean segundoEMaior = numero[1] >= numero[0] && numero[1] > numero[2];
        boolean terceiroEMaior = numero[2] >= numero[1] && numero[2] > numero[0];

        if (primeiroEMaior) {
            System.out.print("O maior numero seria: " + numero[0] + " que foi o primeiro numero a ser digitado");
        } else if (segundoEMaior) {
            System.out.print("O maior numero seria: " + numero[1] + " que foi o segundo numero a ser digitado");
        } else if (terceiroEMaior) {
            System.out.print("O maior numero seria: " + numero[2] + " que foi o terceiro numero a ser digitado");
        }
        scanner.close();
    }
}