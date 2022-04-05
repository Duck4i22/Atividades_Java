import java.util.Scanner;

public class att {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu numero: ");
    Double nome = scanner.nextDouble();

    Double tre = nome* nome * nome ;
    System.out.println("o seu numero ao cubo e: " + tre);

   scanner.close();

   }
}

   
