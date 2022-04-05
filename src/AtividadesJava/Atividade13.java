import java.util.Scanner;
public class Atividade13 {

 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite sua altura: ");
Double altura = scanner.nextDouble();
System.out.printf("qual seu sexo ? (masculino) ou (feminino): ");
char sexo = scanner.next().charAt(0); 

if(sexo == 'm')
 {
double calculoDePesoMasculino = (72.7*altura)-58;
System.out.println("O peso ideal para o sexo masculino seria: " + calculoDePesoMasculino);
 }
else if(sexo== 'f')
 { 
double calculoDePesoFeminino = (62.1*altura)-44.7;
System.out.println( "O peso ideal para o sexo feminim=no seria: " + calculoDePesoFeminino );

}else{
System.out.println("Digite um carcter valido !!!");
}
scanner.close();
    
    }
}
