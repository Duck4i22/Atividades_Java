import java.util.Scanner;
public class atividade12 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("DIgite seu salario por hora: ");
    Double sph = scanner.nextDouble();
    System.out.print("Digite o numeros de horas trabalhadas: ");
    Double hst = scanner.nextDouble();

    double salarioTotal = obterSalarioTotal(sph, hst);
    double sindicato = obterSindicato(salarioTotal);
    double fgts = obterFgts(sindicato);

    boolean salarioMaior = obterSalarioMaior(salarioTotal);
    boolean salarioMaior2 = obterSalarioMaior2(salarioTotal);
    boolean salarioMaior3 = obterSalarioMaior3(salarioTotal);
    boolean salarioMaior4 = obterSalarioMaior4(salarioTotal);

    if(salarioMaior){
        System.out.print("Seu salario bruto e de: "+salarioTotal+" Reais Com todos o discontos fica: "+fgts+" voçe foi isento do Imposto de Renda !"); 
    }else if(salarioMaior2){
        double Id1 = fgts - 1.05;
        System.out.print("Seu salario bruto e de: "+salarioTotal+" Reais Com todos o discontos fica: "+fgts+" voçe nao foi isento do Imposto de Renda sendo assim seu salario ficou na quantia de: "+Id1);
    }else if(salarioMaior3){
        double Id2 = fgts - 1.10;
        System.out.print("Seu salario bruto e de: "+salarioTotal+" Reais Com todos o discontos fica: "+fgts+" voçe nao foi isento do Imposto de Renda sendo assim seu salario ficou na quantia de: "+Id2);
    }else if(salarioMaior4){
        double Id3 = fgts - 1.20;
        System.out.print("Seu salario bruto e de: "+salarioTotal+" Reais Com todos o discontos fica: "+fgts+" voçe nao foi isento do Imposto de Renda sendo assim seu salario ficou na quantia de: "+Id3);
        scanner.close();
        }
    }
    private static double obterSalarioTotal(Double sph, Double hst) {
        return sph * hst;
    }

    private static double obterSindicato(double salarioTotal) {
        return salarioTotal / 0.03;
    }

    private static double obterFgts(double sindicato) {
        return sindicato / 0.11;
    }

    private static boolean obterSalarioMaior(double salarioTotal) {
        return salarioTotal > 0 && salarioTotal <= 900;
    }

    private static boolean obterSalarioMaior2(double salarioTotal) {
        return salarioTotal > 900 && salarioTotal <= 1499;
    }
    private static boolean obterSalarioMaior3(double salarioTotal) {
        return salarioTotal >= 1500 && salarioTotal <= 2499;
    }

    private static boolean obterSalarioMaior4(double salarioTotal) {
        return salarioTotal > 2500;
    }
}