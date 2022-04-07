package AtividadesJavaIf;

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        Double A = scanner.nextDouble();
        System.out.println("Digite o valor de B:");
        Double B = scanner.nextDouble();
        System.out.println("Digite o valor de C:");
        Double C = scanner.nextDouble();

        if (A != 0) {

            Double delta = B * B - 4 * A * C;

            if (delta >= 0) {

                Double raiz = Math.sqrt(delta);

                Double x1 = (-B + raiz) / (2 * A);

                Double x2 = (-B - raiz) / (2 * A);

                System.out.print("x1 = " + x1);
                System.out.print("\nx2 = " + x2);
                System.out.print("\no valor de delta e: " + delta);
                System.out.print("\no valor da raiz e: " + raiz);

            } else {
                System.out.print("Nao foi possivel resolver, pois " + delta + " e menor que 0");
            }
        } else {
            System.out.print("NAo e uma equaçao de segundo grau, pois A e  = 0");
        }

        scanner.close();
    }
}