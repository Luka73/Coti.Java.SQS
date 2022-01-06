package repositories;

import java.io.File;
import java.io.PrintWriter;
import entities.Fornecedor;
import entities.Produto;
import interfaces.IFornecedorRepository;

public class FornecedorRepository implements IFornecedorRepository {

    @Override
    public void exportar(Fornecedor obj) throws Exception {
        PrintWriter print = new PrintWriter("c:\\temp\\fornecedor_"
                        + obj.getIdFornecedor() + ".txt");
        print.write("\nId do Fornecedor........: " + obj.getIdFornecedor());
        print.write("\nNome....................: " + obj.getNome());
        print.write("\nCNPJ....................: " + obj.getCnpj());

        for (Produto produto : obj.getProdutos()) {
            print.write("\n");
            print.write("\n\tId do Produto.......: " + produto.getIdProduto());
            print.write("\n\tNome................: " + produto.getNome());
            print.write("\n\tPreço...............: " + produto.getPreco());
            print.write("\n\tQuantidade..........: " + produto.getQuantidade());
            print.write("\n\tCategoria...........: " + produto.getCategoria());
        }

        print.flush();
        print.close();
    }
}
