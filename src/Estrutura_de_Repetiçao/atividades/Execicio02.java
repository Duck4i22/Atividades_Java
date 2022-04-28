package Estrutura_de_Repetiçao.atividades;

import java.util.Scanner;

public class Execicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] semanaUm = new Double[]{1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0};
        Double[] semanaDois = new Double[]{1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0};
        Double[] semanaTres = new Double[]{1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0};
        Double[] semanaQuatro = new Double[]{2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0};
        Double[][] mes = new Double[][]{semanaUm, semanaDois, semanaTres, semanaQuatro};
        Double[] valor = new Double[] {0.0,0.0,0.0,0.0};
        int semanaDoMaiorFaturamento = 0;
        double maiorFaturamento = 0;

        for (int i = 0; i <=6 ; i++) {
            valor[0] += mes[0][i];
            valor[1] += mes[1][i];
            valor[2] += mes[2][i];
            valor[3] += mes[3][i];
        }
        for (int y = 0; y < 4; y++) {
            if(valor[y]>maiorFaturamento) {
                maiorFaturamento = valor[y];
                semanaDoMaiorFaturamento = y +1;
            }
        }
        System.out.print("A Semana que mais faturou foi a semana:"+ semanaDoMaiorFaturamento + " E e o  valor que a semana rendeu foi de: "+maiorFaturamento);
    }
}

// nada de copiar em ;]