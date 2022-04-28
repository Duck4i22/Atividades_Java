package objetos;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "RTX 3090 TI";
        produto.precoUnitario = 8000.0;
        produto.quantidade = 5;

        exibirInfomacoesDoProduto(produto);

    }
    static void exibirInfomacoesDoProduto(Produto produto) {

        System.out.print("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade + " unidade(s).");

    }
}