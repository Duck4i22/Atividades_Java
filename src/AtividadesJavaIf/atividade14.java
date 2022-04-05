import java.util.Scanner;
public class atividade14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] nota = new double[2];
    for (int y=0;y<2;y++){
        System.out.print("Didite sua nota do "+(y+1)+" do trimestre: ");
        nota[y]= scanner.nextDouble();
    }
    double Media = (nota[0] + nota[1])/2;
    boolean notaA = obterNotaA(Media);
    boolean notaB = obterNotaB(Media);
    boolean notaC = obterNotaC(Media);
    boolean notaD = obterNotaD(Media);
    boolean notaF = obterNotaF(Media);

    if(notaA){
        System.out.print("Sua nota é A");
    }else if(notaB){
        System.out.print("Sua nota é B");
    }else if(notaC){
        System.out.print("Sua nota é C");
    }else if(notaD){
        System.out.print("Sua nota é  D");
    }else if(notaF){
        System.out.print("F de Faleceu");
    }
    scanner.close();
    }
    private static boolean obterNotaA(double Media) {
        return Media >= 9 && Media <= 10;
    }
    private static boolean obterNotaB(double Media) {
        return Media >= 7.5 && Media < 9;
    }
    private static boolean obterNotaC(double Media) {
        return Media >= 6 && Media < 7.5;
    }
    private static boolean obterNotaD(double Media) {
        return Media >= 4 && Media < 6;
    }
    private static boolean obterNotaF(double Media) {
        return Media < 4 && Media >= 0;
    }
}