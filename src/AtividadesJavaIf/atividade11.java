package AtividadesJavaIf;
import java.util.Scanner;
    public class atividade11 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o Valor Do Seu Salario: ");
    Double salario = scanner.nextDouble();

    boolean salarioIgualA280 = obterTamanhoDoSalario1(salario);
    boolean salarioEntre280E700 = obterTamanhoDoSalario2(salario);
    boolean salarioEntre700E1500 = obterTamanhoDoSalario3(salario);
    boolean salarioMaiorQue1500 = obterTamanhoDoSalario4(salario);

    if(salarioIgualA280){
    Double calcularAumento = obterCalcularAumento(salario);
    double aumento1 = obterAumento1(salario, calcularAumento);
    System.out.print("Seu salario de 280 reais foi aumentado em 20% e foi para: " + calcularAumento +" Voçe teve um aumento de: "+aumento1+" Reais");
    }else if(salarioEntre280E700){
    Double calcularAumento2 = obterCalcularAumento2(salario);
    double aumento2 = obterAumento2(salario, calcularAumento2);
    System.out.print("Seu Salario de "+ salario + " Reais Foi aumentado em 15% e foi para: " + calcularAumento2 +" Voçe teve um aumento de: "+aumento2+" Reais");
    }else if(salarioEntre700E1500){
    Double calcularAumento3 = obterCalcularAlmento3(salario);
    double aumento3 = obterAumento3(salario, calcularAumento3);
    System.out.print("Seu Salario de "+ salario + " Reais Foi aumentado em 10% e foi para: "+ calcularAumento3 +" Voçe teve um aumento de: "+aumento3+" Reais");
    }else if(salarioMaiorQue1500){
    Double calcularAumento4 = obterCalcularAumento4(salario);
    double aumento4 = obterAumento4(salario, calcularAumento4);
    System.out.print("Seu Salario de "+ salario + " Reais Foi aumentado em 5% e foi para: "+ calcularAumento4 +" Voçe teve um aumento de: "+aumento4+" Reais");
    }
    scanner.close();
    }
        private static boolean obterTamanhoDoSalario1(Double salario) {
            return salario <= 280;
        }
        private static boolean obterTamanhoDoSalario2(Double salario) {
            return salario > 280 && salario <= 700;
        }
        private static boolean obterTamanhoDoSalario3(Double salario) {
            return salario > 700 && salario <= 1500;
        }
        private static boolean obterTamanhoDoSalario4(Double salario) {
            return salario > 1500;
        }
        private static double obterAumento1(Double salario, Double calcularAumento) {
            return calcularAumento - salario;
        }
        private static double obterAumento2(Double salario, Double calcularAumento2) {
            return calcularAumento2 - salario;
        }
        private static double obterAumento3(Double salario, Double calcularAlmento3) {
            return calcularAlmento3 - salario;
        }
        private static double obterAumento4(Double salario, Double calcularAumento4) {
            return calcularAumento4 - salario;
        }
        private static double obterCalcularAumento(Double salario) {
            return salario * 1.20;
        }

        private static double obterCalcularAumento2(Double salario) {
            return salario * 1.15;
        }

        private static double obterCalcularAlmento3(Double salario) {
            return salario * 1.10;
        }

        private static double obterCalcularAumento4(Double salario) {
            return salario * 1.05;
        }
    }
