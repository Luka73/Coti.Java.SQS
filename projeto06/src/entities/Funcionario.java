package entities;

import enums.TipoContratacao;

public class Funcionario {
    private Integer idFuncionario;
    private String nome;
    private String cpf;
    private String matricula;
    private TipoContratacao tipo;

    public Funcionario() {

    }

    public Funcionario(Integer idFuncionario, String nome, String cpf,
                       String matricula, TipoContratacao tipo) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoContratacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoContratacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Funcionario [idFuncionario=" + idFuncionario
                + ", nome=" + nome + ", cpf=" + cpf + ", matricula="
                + matricula + ", tipo=" + tipo + "]";
    }
}
