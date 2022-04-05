import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua temperatura(em fahrenheit): ");
        Double temperaturaFahrenheit = scanner.nextDouble();
        Double temperaturaCelsius = 5*((temperaturaFahrenheit-32)/9);
        System.out.println("a temperatura em celsius e: " + temperaturaCelsius );
        scanner.close();
     }
 }
    