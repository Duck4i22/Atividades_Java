import java.util.Scanner;
public class att_6 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o raio do seu circulo: ");
        Double raio = scanner.nextDouble();

        Double area = 3.14 * raio*raio ;

        System.out.print("A area do seu circulo e : " + area );

        scanner.close();
    
       }
    }
    

