package AtividadesJavaIf;

import java.util.Scanner;
public class atividade10 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Qual turdo voçe estuda: (N=Noite)-(M=manhã)-(T=tarde):");
char turno = scanner.nextLine().charAt(0);

boolean noite = turno=='n'|| turno=='N';
boolean tarde = turno=='t'|| turno=='T';
boolean dia = turno=='m'|| turno=='M';

if(noite){
    System.out.print("Boa Noite aluno =]");
}else if(tarde){
    System.out.print("Boa tarde aluno =]");
}else if(dia){
    System.out.print("Bom Dia aluno =]");
}else{
    System.out.print("Digite uma Letra valida !!!");
}
scanner.close();
    }
}