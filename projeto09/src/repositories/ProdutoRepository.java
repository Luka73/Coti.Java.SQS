package repositories;

import entities.Produto;
import interfaces.IProdutoRepository;

import java.io.PrintWriter;

public class ProdutoRepository implements IProdutoRepository {

    @Override
    public void exportar(Produto obj) throws Exception {
        PrintWriter print = new PrintWriter("c:\\temp\\produto_"
                + obj.getIdProduto() + ".txt");
        print.write("\nId do Produto.......: " + obj.getIdProduto());
        print.write("\nNome................: " + obj.getNome());
        print.write("\nPreço...............: " + obj.getPreco());
        print.write("\nQuantidade..........: " + obj.getQuantidade());
        print.write("\nCategoria...........: " + obj.getCategoria());
        print.write("\nNome do Fornecedor..: " + obj.getFornecedor().getNome());
        print.write("\nCNPJ................: " + obj.getFornecedor().getCnpj());
        print.flush();
        print.close();
    }
}
