package entities;

import enums.Categoria;

public class Produto {
    private Integer idProduto;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Categoria categoria;
    private Fornecedor fornecedor;

    public Produto() {

    }
    public Produto(Integer idProduto, String nome, Double preco,
                   Integer quantidade, Categoria categoria, Fornecedor fornecedor) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto [idProduto=" + idProduto + ", nome="
                + nome + ", preco=" + preco + ", quantidade=" + quantidade
                + ", categoria=" + categoria + ", fornecedor=" + fornecedor + "]";
    }
}
