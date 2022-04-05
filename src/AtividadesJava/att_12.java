import java.util.Scanner;
public class att_12 {
    
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua altura: ");
    Double altura = scanner.nextDouble();

    double peso = (72.27*altura)-58;

    System.out.println("Seu peso idea seria: " + peso );

    scanner.close();

}



}
