package Estrutura_de_Repetiçao.atividades;

/*
Dada a lista de números abaixo:
Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
... Itere por essa lista e imprima todos os números que são divisíveis por 3.
Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo. Toda vez que o módulo de um número
por 3 for igual a zero, então esse número e divisível por 3.
 */

public class Execicio01 {

    private static final byte DIVISOOR = 3;

    public static void main(String[] args) {

        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < numeros.length; i++) {

            boolean verificarSeDivisivel = numeros[i] % DIVISOOR == 0;

            Integer numero = numeros[i];

            if (verificarSeDivisivel) {
                System.out.println("o numero: " + numero + " e divisivel por 3");
            }
        }
    }
}