import java.util.Scanner;
public class atividade16 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Digite o um valor:");
    Double A = scanner.nextDouble();
    System.out.println("Digite o um valor:");
    Double B = scanner.nextDouble();
    System.out.println("Digite o um valor:");
    Double C = scanner.nextDouble();


    Double equaçao = null;
    Double delta = null;
    Double bhaskara =null;


    if(A<=0){
        System.out.print("Valor é igual 0 ");
    }else if(equaçao == 0){
        System.out.print("Valor é igual 0 ");
    }else if(equaçao >=1){
        System.out.print("o valor da equçao e de: "+ equaçao);
    }
        scanner.close();
    }
}