import java.util.Scanner;
public class atividade17 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("digite quatro numeros que represente um ano de sua escolha: ");
    Double ano = scanner.nextDouble();

    if(((ano%4 == 0)&&(ano%100 !=0))||(ano%400==0)){
        System.out.print("o ano e bissexto");
    }else{
        System.out.print("o ano nao e bissexto");
    }
        scanner.close();
    }
}