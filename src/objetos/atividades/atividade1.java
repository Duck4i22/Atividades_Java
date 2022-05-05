/*
package objetos.atividades;
import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        placa laca = new placa();
        laca.nome = "RTX 3060 TI";
        laca.precoUnitario = 5000.0;
        laca.quantidade = 10;

        System.out.println("Escreva a quantidade do produto: ");
        int quantidadeEscolhida = scanner.nextInt();

        boolean quantidadeDeProdutoQueSobrou = quantidadeEscolhida > laca.quantidade;

    0210    int totalAposEscolha = laca.quantidade - quantidadeEscolhida;1400
0210
        quantidadeMaiorQueEstoque(quantidadeDeProdutoQueSobrou,laca,totalAposEscolha);

    }
        static void quantidadeMaiorQueEstoque(boolean quantidadeDeProdutoQueSobrou,placa placa,int totalAposEscolha) {

            if (quantidadeDeProdutoQueSobrou) {

                System.err.print("ERRO");


            }else{
                exibirInfomacoesDoProduto(placa,totalAposEscolha,quantidadeEscolhida );
                exibirInformaçoesdeCompra(quantidadeDeProdutoQueSobrou,placa);
            }
        }

    static void exibirInfomacoesDoProduto (placa placa,int totalAposEscolha,int quantidadeEscolhida ){
        System.out.print("Parabens pela compra do produto " + placa.nome + "na quantidade " + quantidadeEscolhida + "!!!!!!!!!!!");
        System.out.print("Quantidade em estoque do produto " + placa.nome + " é de " + totalAposEscolha  + " unidade(s).");
    }

    static void exibirInformaçoesdeCompra (boolean quantidadeDePlaca, placa placa){

        if (quantidadeDePlaca) {
            System.out.println("produto em falta =(");
        } else {

        }
    }
}
*/
