import java.util.Scanner;
public class Atividade11 {
    
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o 1° numero inteiro: ");
    Double n1 = scanner.nextDouble();

    System.out.print("Digite o 2° numero inteiro: ");
    Double n2 = scanner.nextDouble();

    System.out.print("Digite um numero real: ");
    Double n3 = scanner.nextDouble();
    
    System.out.printf("qual dos produtos de operaçao voçe quer ? (a,b,c): ");
    char d = scanner.next().charAt(0);
        

    if(d == 'a')
    {

    Double cal1 = n1*2;
    Double cal2 = n2/2;
    Double soma1 = cal1 + cal2;


    System.out.println("O produto do dobro do primeiro com metade do segundo e: " + soma1);

    }

    else if(d== 'b')

    {

    Double cal3 = (n1*3) + n3 ;

    System.out.println( "A soma do triplo do primeiro com o terceiro e: " + cal3 );

    }

    else if(d== 'c')

    {

    Double cal4 = n3*n3*n3;

    System.out.println("O terceiro elevado ao cubo e: " + cal4 );

    } else{

    System.out.println("Informe um numero valido");    

    }

    scanner.close();
    
        }
 }