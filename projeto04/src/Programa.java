import entities.Fornecedor;
import entities.Produto;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        //criando um objeto fornecedor
        Fornecedor fornecedor = new Fornecedor();
        //atribuindo os dados do fornecedor
        fornecedor.setIdFornecedor(1);
        fornecedor.setNome("Fornecedor Exemplo");
        fornecedor.setCnpj("12345678902234");
        //criando uma lista de produtos
        List<Produto> produtos = new ArrayList<Produto>();
        //criando um produto
        Produto produto1 = new Produto();
        produto1.setIdProduto(1);
        produto1.setNome("Notebook");
        produto1.setPreco(3000.0);
        produto1.setQuantidade(10);
        //criando um produto
        Produto produto2 = new Produto();
        produto2.setIdProduto(2);
        produto2.setNome("Mochila");
        produto2.setPreco(400.0);
        produto2.setQuantidade(20);
        //adicionando os produtos na lista..
        produtos.add(produto1);
        produtos.add(produto2);
        //atribuir a lista de produtos para o fornecedor..
        fornecedor.setProdutos(produtos);

        try {
            PrintWriter writer = new PrintWriter("c:\\temp\\fornecedor.txt");
            writer.write("\nId do fornecedor....: " + fornecedor.getIdFornecedor());
            writer.write("\nNome do fornecedor..: " + fornecedor.getNome());
            writer.write("\nCNPJ................: " + fornecedor.getCnpj());
            writer.write("\n");
            for(Produto item : fornecedor.getProdutos()) {
                writer.write("\tId do Produto...: " + item.getIdProduto());
                writer.write("\tNome............: " + item.getNome());
                writer.write("\tPreço...........: " + item.getPreco());
                writer.write("\tQuantidade......: " + item.getQuantidade());
                writer.write("\n");
            }
            writer.flush();
            writer.close();
            System.out.println("\nArquivo gravado com sucesso.");
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
