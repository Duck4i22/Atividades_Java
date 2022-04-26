package metodos;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] multiplicador = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int numero = digitarONumeroQueVaiSerMultiplicado();
        mostraATabuada(multiplicador, numero);

    }

    static int digitarONumeroQueVaiSerMultiplicado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o numero a ser multiplicador: ");
        int multiplicado = scanner.nextInt();
        return multiplicado;
    }

    static void mostraATabuada(Integer[] multiplicador, int numero) {
        int soma = 0;
        for (int y = 0; y < multiplicador.length; y++) {

            soma = numero * multiplicador[y];
            System.out.println(numero + " * " + multiplicador[y] + "= " + soma);
        }
    }
}
