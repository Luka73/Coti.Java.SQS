package entities;

public class Funcao {
    private Integer idFuncao;
    private String nome;
    private String descricao;

    public Funcao() {

    }

    public Funcao(Integer idFuncao, String nome, String descricao) {
        this.idFuncao = idFuncao;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Integer idFuncao) {
        this.idFuncao = idFuncao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
