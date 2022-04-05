package AtividadesJavaIf;
import java.util.Scanner;
class Atividade1{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite um numero: ");
double numero1 = scanner.nextDouble();
System.out.print("Digite um numero: ");
double numero2 = scanner.nextDouble();

boolean n1Maior = numero1>numero2;

if(n1Maior){
    System.out.print(numero1 + " e maior" );
}else{
    System.out.print(numero2 + " e maior" );
}
scanner.close();
    }
}