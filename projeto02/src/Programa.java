import entities.Produto;

public class Programa {
    public static void main(String[] args) {
        //criando um objeto da classe Produto
        Produto produto = new Produto();
        //atribuindo valores para o produto
        //métodos set (entrada de dados)
        produto.setIdProduto(1);
        produto.setNome("Notebook");
        produto.setPreco(2000.0);
        produto.setQuantidade(10);
        produto.setDescricao("Core I7, 8GB, SSD");
        //imprimindo os dados do produto
        //métodos get (saída de dados)
        System.out.println("\nDADOS DO PRODUTO:\n");
        System.out.println("\nId do produto.........: " + produto.getIdProduto());
        System.out.println("\nNome do produto.......: " + produto.getNome());
        System.out.println("\nPreço.................: " + produto.getPreco());
        System.out.println("\nQuantidade............: " + produto.getQuantidade());
        System.out.println("\nDescrição.............: " + produto.getDescricao());

        //criando um objeto da classe Produto com a sobrecarga de construtores
        Produto produto2 = new Produto(1, "Notebook",
                2000.0, 10, "Core I7, 8GB, SSD");
    }
}
