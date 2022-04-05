import java.util.Scanner;
public class att_7 {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o tamanhao de ums dos lados do seu quadrado: ");
        Double n1 = scanner.nextDouble();

        Double a = n1*n1;

        double b = a*2;

        System.out.print("A area do seu quadrado e : " + a + " e o dobro da area e :" + b );

       scanner.close();
    
       }
    }
    

