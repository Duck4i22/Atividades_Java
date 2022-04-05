import java.util.Scanner;
public class atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do 1º produto: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Digite o valor do 2º produto: ");
        Double numero2 = scanner.nextDouble();
        System.out.print("Digite o valor do 3º produto: ");
        Double numero3 = scanner.nextDouble();

        boolean opcaoBarata1 = numero1 <= numero2 && numero1<numero3;
        boolean opcaoBarata2 = numero2 <= numero1 && numero2<numero3;
        boolean opçaoBarata3 = numero3 <= numero2 && numero3<numero1;
      
        if(opcaoBarata1){
            System.out.print("o mais barato seria o 1º produto com o preço de: " + numero1 + " R$ portanto vou levar ele" );
        }else if(opcaoBarata2){
            System.out.print("o mais barato seria o 2º produto com o preço de: " + numero2 + " R$ portanto vou levar ele"  );
        }else if (opçaoBarata3){
            System.out.print("o mais barato seria o 3º produto com o preço de: " + numero3 + " R$ portanto vou levar ele" );
        }
        scanner.close();
    }
}