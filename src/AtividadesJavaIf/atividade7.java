package AtividadesJavaIf;

import java.util.Scanner;
public class atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu 1º numero: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Digite seu 2º numero: ");
        Double numero2 = scanner.nextDouble();
        System.out.print("Digite seu 3º numero: ");
        Double numero3 = scanner.nextDouble();

        boolean primeiroDigitado = numero1 <= numero2 && numero1<numero3;
        boolean segundoDigitado = numero2 <= numero1 && numero2<numero3;
        boolean terceiroDigitado = numero3 <= numero2 && numero3<numero1;

        if(primeiroDigitado){
            System.out.print("O menor numero seria: " + numero1 + " que foi o primeiro numero a ser digitado" );
        }else if(segundoDigitado){
            System.out.print("O menor numero seria: " + numero2 + " que foi o segundo numero a ser digitado" );
        }else if (terceiroDigitado){
            System.out.print("O menor numero seria: " + numero3 + " que foi o terceiro numero a ser digitado" );
        }
        scanner.close();
    }
}