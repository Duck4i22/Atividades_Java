import java.util.Scanner;
public class atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] lado = new double[3];
        for (int y = 0; y < 3; y++) {
            System.out.print("Escreva o lado " + (y + 1) + " do triagulo: ");
            lado[y] = scanner.nextDouble();
        }

        boolean VerificarSePodeSerTriagulo = obterVerificarSePodeSerTriagulo(lado);
        boolean verificarSeEquilatero = obterVerificarSeEquilatero(lado);
        boolean verificarSeEscaleno = obterVerificarSeEscaleno(lado);
        boolean verificarSeIsosceles = obterVerificarSeIsosceles(lado);

        if (VerificarSePodeSerTriagulo) {
            System.out.println("\npode ser triangulo");
        }
            if (verificarSeEquilatero) {
                System.out.print("\nTriangulo Equilatero");
            } else if (verificarSeEscaleno) {
                System.out.print("\nTriangulo Escaleno");
            } else if (verificarSeIsosceles) {
                System.out.print("\nTriangulo isosceles");
            }

            scanner.close();
        }

    private static boolean obterVerificarSeIsosceles(double[] lado) {
        return lado[0] == lado[1] && lado[0] == lado[2] && lado[1] == lado[2];
    }
    private static boolean obterVerificarSeEscaleno(double[] lado) {
        return lado[0] != lado[1] && lado[0] != lado[2] && lado[1] != lado[2];
    }
    private static boolean obterVerificarSeEquilatero(double[] lado) {
        return lado[0] == lado[1] && lado[0] == lado[2];
    }
    private static boolean obterVerificarSePodeSerTriagulo(double[] lado) {
        return (lado[0] + lado[1]) > lado[2] && (lado[0] + lado[2]) > lado[1] && (lado[1] + lado[2]) > lado[2];
    }
}