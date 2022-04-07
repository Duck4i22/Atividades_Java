package AtividadesJavaIf;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite sua nota do " + (i + 1) + " Bimestre: ");
            notas[i] = scanner.nextDouble();
        }
        double media = obterMedia(notas);
        boolean aprovadoComDistincao = media == 10;
        boolean aprovado = media >= 7;

        if (aprovadoComDistincao) {
            System.out.print("O aluno foi aprovado merito =] !! com a media de: " + media);
        } else if (aprovado) {
            System.out.print("O aluno foi aprovado com a media de: " + media);
        } else {
            System.out.print("O aluno foi reprovado =[ com a media de: " + media);
        }
        scanner.close();
    }

    private static double obterMedia(double[] nota) {
        return (nota[0] + nota[1]) / 2;
    }
}