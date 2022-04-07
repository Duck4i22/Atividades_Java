package AtividadesJava;
import java.util.Scanner;
public class Att_18 {
    
    public static void main(String[] args) {   
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Qual o tamanho do arquivo em MB: ");
    Double tamanhoDoarquivo = scanner.nextDouble();
    System.out.print("Qual a sua velocidade de rede: ");
    Double velocidadeDaRede = scanner.nextDouble();

    Double temp = tamanhoDoarquivo/(velocidadeDaRede/8);
    System.out.println("o tempo e que levaria pro arquivo seria: " + temp + " Segundos");
      }
    }
