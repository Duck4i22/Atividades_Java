package AtividadesJavaIf;
import java.util.Scanner;
class Atividade2{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite um numero: ");
Double numero1 = scanner.nextDouble();

boolean positivoOuNegativo = obterPositivoOuNegativo(numero1);

if(positivoOuNegativo)
{
    System.out.print(numero1 + " e positivo" );
}else{
    System.out.print(numero1 + " e negativo" );
}
    scanner.close();
    }

    private static boolean obterPositivoOuNegativo(Double numero1) {
        return numero1 >= 0;
    }
}