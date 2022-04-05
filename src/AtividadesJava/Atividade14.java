import java.util.Scanner;
class Atividade14{

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Qual o peso do seu peixe: ");
Double pesoDoPeixe = scanner.nextDouble();

if(pesoDoPeixe<=50)
{
    System.out.print("O Peixe Pesa "+ pesoDoPeixe + " kg Nao Precisa Pagar Multa");
}else{
    double limite = pesoDoPeixe-50;
    double multa = limite*4;

    System.out.print("O Peixe Pesa " + pesoDoPeixe + "Kg Voçe Passou o limite Em " + limite + " Kg Vai Ter Que Pagar Uma Multa De " + multa + " Reais " );
}
    scanner.close();

    }
}