import java.util.Scanner;
public class atividade9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu 1º numero: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Digite seu 2º numero: ");
        Double numero2 = scanner.nextDouble();
        System.out.print("Digite seu 3º numero: ");
        Double numero3 = scanner.nextDouble();

        if(numero1>numero2){
        if(numero2>numero3){
            System.out.print(numero1+" "+numero2+" "+numero3);
        }else{
        if(numero1>numero3){
            System.out.print(numero1+" "+numero3+" "+numero2);
        }else{
            System.out.print(numero3+" "+numero1+" "+numero2);
        }}
        }else{
        if(numero2>numero3){
        if(numero1>numero3){
            System.out.print(numero2+" "+numero1+" "+numero3);
        }else{
            System.out.print(numero2+" "+numero3+" "+numero1);
        }}else{
            System.out.print(numero3+" "+numero2+" "+numero1);
            }
        }  
        scanner.close();
    }
}