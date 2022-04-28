package objetos.atividades;
import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        placa laca = new placa();
        laca.nome = "RTX 3060 TI";
        laca.precoUnitario = 5000.0;
        laca.quantidade = 10;

        System.out.println("Escreva a quantidade do produto ");
        int quantidadeEscolhida = scanner.nextInt();

        boolean quantidadeDeProdutoQueSobrou = quantidadeEscolhida > laca.quantidade;

        boolean quantidadeDePlaca = laca.quantidade < 10;

        int totalAposEscolha = laca.quantidade - quantidadeEscolhida;

        quantidadeMaiorQueEstoque(quantidadeDeProdutoQueSobrou,laca,totalAposEscolha);

    }
        static void quantidadeMaiorQueEstoque(boolean quantidadeDeProdutoQueSobrou,placa placa,int totalAposEscolha) {

            if (quantidadeDeProdutoQueSobrou) {

                System.out.print("Quantidade em estoque do produto " + placa.nome + " é de " + totalAposEscolha + " unidade(s).");

            }else{
                exibirInfomacoesDoProduto(placa);
                exibirInformaçoesdeCompra(quantidadeDeProdutoQueSobrou,placa);
            }
        }

    static void exibirInfomacoesDoProduto (placa placa){
        System.out.print("Quantidade em estoque do produto " + placa.nome + " é de " + placa.quantidade  + " unidade(s).");
    }

    static void exibirInformaçoesdeCompra (boolean quantidadeDePlaca, placa placa){

        if (quantidadeDePlaca) {
            System.out.println("produto em falta =(");
        } else {
            exibirInfomacoesDoProduto(placa);
        }
    }
}