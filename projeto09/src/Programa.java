import java.util.ArrayList;
import entities.Fornecedor;
import entities.Produto;
import enums.Categoria;
import repositories.FornecedorRepository;
import repositories.ProdutoRepository;

public class Programa {
    public static void main(String[] args) {
        //criando um objeto fornecedor
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setIdFornecedor(1);
        fornecedor.setNome("Loja de Informática");
        fornecedor.setCnpj("1234567890000");
        //criando objetos do tipo Produto associando-os com o fornecedor
        Produto produto1 = new Produto(1, "Notebook", 3000.0,
                10, Categoria.INFORMATICA, fornecedor);
        Produto produto2 = new Produto(2, "Xbox", 2500.0,
                8, Categoria.GAMES, fornecedor);
        Produto produto3 = new Produto(3, "Projetor", 1000.0,
                4, Categoria.ELETRONICOS, fornecedor);
        Produto produto4 = new Produto(4, "Mouse", 50.0,
                10, Categoria.INFORMATICA, fornecedor);

        //adicionando os produtos ao objeto Fornecedor
        fornecedor.setProdutos(new ArrayList<Produto>());
        fornecedor.getProdutos().add(produto1);
        //adicionando produto
        fornecedor.getProdutos().add(produto2);
        //adicionando produto
        fornecedor.getProdutos().add(produto3);
        //adicionando produto
        fornecedor.getProdutos().add(produto4);
        //adicionando produto
        try {
            FornecedorRepository fornecedorRepository = new FornecedorRepository();
            ProdutoRepository produtoRepository = new ProdutoRepository();
            //exportar os dados para arquivos..
            fornecedorRepository.exportar(fornecedor);
            //exportar os produtos
            for(Produto produto : fornecedor.getProdutos()) {
                produtoRepository.exportar(produto);
            }
            System.out.println("\nDados gravados com sucesso!");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
