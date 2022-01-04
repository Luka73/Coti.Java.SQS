package entities;

public class Produto {
    //atributos (campos)
    private Integer idProduto;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private String descricao;

    //método construtor default (vazio)
    public Produto() {
    }

    //sobrecarga (OVERLOADING) do método construtor
    //este construtor esta recebendo parametros
    //para inicializar os atributos da classe
    public Produto(Integer idProduto, String nome, Double preco,
                   Integer quantidade, String descricao) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
