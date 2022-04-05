import java.util.Scanner;
public class att_5 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite um valor em metros: ");
        Double n1 = scanner.nextDouble();

        
        Double trans = n1 * 100 ;


        System.out.print("A sua media e de : " + trans );


       scanner.close();
    
       }
    }
    
