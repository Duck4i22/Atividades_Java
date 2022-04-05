import java.util.Scanner;
public class att_15 {
    
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);


        System.out.print("DIgite seu salario por hora: ");
        Double sph = scanner.nextDouble();


        System.out.print("Digite o numeros de horas trabalhadas: ");
        Double hst = scanner.nextDouble();


        double salario = sph*hst;
        double inss = salario / 8 ;
        double sind = salario / 5;
        double inpostoderenda = salario / 11;

        double safinal = salario - inss - sind - inpostoderenda;

        System.out.print("O seu salario final e de " + safinal + "\n vc pagou para o inss a quantia de " + inss + "\n vc pagou para o sindicato a quantia de " + sind + "\n vc pagou para o imposto de renda a quantia de " + inpostoderenda );
        
        scanner.close();

    }
}
