package entities;

public class Pessoa {

    private Integer idPessoa;
    private String nome;
    private String sobrenome;

    public Pessoa() {

    }

    public Pessoa(Integer idPessoa, String nome, String sobrenome) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Pessoa [idPessoa=" + idPessoa + ", nome="
                + nome + ", sobrenome=" + sobrenome + "]";
    }
}
