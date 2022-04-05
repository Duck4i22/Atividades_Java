package AtividadesJavaIf;
import java.util.Scanner;
class Atividade4{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite uma letra: ");
char letra = scanner.next().charAt(0);

boolean saberQualCategoria = (letra == 'a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u');
boolean saberQualCaregoria2 = (letra >='a')&&(letra<='z');

if(saberQualCategoria){
    System.out.print( "A letra e da classe das vogais" );
}else if (saberQualCaregoria2){
    System.out.print("A letra e da classe das consoantes" );
}else{
    System.out.println("E um numero zé !!!!!!!!!!!");
}
scanner.close();
    }
}