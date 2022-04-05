import java.util.Scanner;
public class att_8 {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Qual o valor do seu salario por hora: ");
    Double saporhora = scanner.nextDouble();

    System.out.println("Quantas horas trabalhadas ? ");
    Double horas = scanner.nextDouble();

    Double safinal = saporhora*horas;

    System.out.println("o seu ganho mo fimal do mes e de: " + safinal );

     scanner.close();
    
       }
    }
    

