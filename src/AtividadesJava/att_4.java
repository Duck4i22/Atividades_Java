package AtividadesJava;

import java.util.Scanner;
public class att_4 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite sua nota no 1° trimestre: ");
        Double n1 = scanner.nextDouble();

        System.out.print("Digite sua nota no 2° trimestre: ");
        Double n2 = scanner.nextDouble();

        System.out.print("Digite sua nota no 3° trimestre: ");
        Double n3 = scanner.nextDouble();

        System.out.print("Digite sua nota no 4° trimestre: ");
        Double n4 = scanner.nextDouble();

        Double soma = (n1 + n2 + n3 + n4) / 4 ;

        System.out.print("A sua media e de : " + soma );

       scanner.close();
    
       }
    }
    

