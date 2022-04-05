import java.util.Scanner;
public class atividade13 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    double dia = scanner.nextDouble();

    boolean segunda = dia == 1;
    boolean terca = dia == 2;
    boolean quarta = dia == 3;
    boolean quinta = dia == 4;
    boolean sexta = dia == 5;
    boolean sabado = dia == 6;
    boolean domingo = dia == 7;

    if(segunda){
        System.out.print("Domingo");
    }else if(terca){
        System.out.print("Segunda");
    }else if(quarta){
        System.out.print("terça");
    }else if(quinta){
        System.out.print("Quarta");
    }else if(sexta){
        System.out.print("Quinta");
    }else if(sabado){
        System.out.print("Sexta");
    }else if(domingo){
        System.out.print("Sabadooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo !!!!!!!!!!!!!!!!!!!!!!!!!!");
    }else{
        System.out.print("Digite ate qauntidade de dias da semana !!");
    }
    scanner.close();
    }
}
