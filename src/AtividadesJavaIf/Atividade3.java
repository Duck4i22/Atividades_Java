package AtividadesJavaIf;
import java.util.Scanner;
class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu sexo: (m=masculino)/(f=feminino): ");
        char sexo = scanner.next().charAt(0);

        boolean saberOSexo = sexo == 'm' || sexo == 'M';
        boolean saberOSexo2 = sexo == 'f' || sexo == 'F';
        boolean invalido = !!saberOSexo || !saberOSexo2;

        if (invalido) {
            System.out.print("Digite um carcter valido !!");
        } else {

            if (saberOSexo) {
                System.out.print("masculino");
            } else if (saberOSexo2) {
                System.out.print("feminino");
            } else {
                new Atividade3();
            }
            scanner.close();
        }
    }
}