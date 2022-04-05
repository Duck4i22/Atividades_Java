import java.util.Scanner;
public class att_10 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
       System.out.print("Digite sua temperatura(em celsius): ");
       Double saporhora = scanner.nextDouble();

       Double c = saporhora * 1.8 + 32;

       System.out.println("a temperatura em fahrenheit e: " + c );

       scanner.close();
    
       }
    }
    