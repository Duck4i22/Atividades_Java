import java.util.Scanner;
public class Att_17 {
    
    public static void main(String[] args) {
        
    try (Scanner scanner = new Scanner(System.in)) {
            
    System.out.print("Qual o tamanho da area em m²: ");
    Double tamnhoDaArea = scanner.nextDouble();
    double valorDaLata = 80;
    double capacidade = 18;
    Double coberturaDaTinta = tamnhoDaArea / 6;
    double quantidadeDeLatas = coberturaDaTinta / capacidade;
    Double valorfinal = quantidadeDeLatas * valorDaLata;
    
    System.out.println("A quantidade de latas que sao necessarias sao: " + quantidadeDeLatas + " e o preço e de: " + valorfinal + " Reais" );
        }
    }
}