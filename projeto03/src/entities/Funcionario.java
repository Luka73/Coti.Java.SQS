package entities;

import java.util.Date;

public class Funcionario extends Pessoa {
    private String matricula;
    private Date dataAdmissao;
    private Double salario;
    private Funcao funcao;

    public Funcionario() {

    }

    public Funcionario(Integer idPessoa, String nome, String cpf,
                       String matricula, Date dataAdmissao, Double salario) {
        super(idPessoa, nome, cpf);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Funcao getFuncao() {
        return funcao;
    }
    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
}
