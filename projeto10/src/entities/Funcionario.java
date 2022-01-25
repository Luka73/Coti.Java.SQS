package entities;

public class Funcionario {
    private Integer idFuncionario;
    private String nome;
    private String cpf;
    private String matricula;
    private Double salario;

    public Funcionario() {

    }

    public Funcionario(Integer idFuncionario, String nome,
                       String cpf, String matricula, Double salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.salario = salario;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [idFuncionario=" + idFuncionario
                + ", nome=" + nome + ", cpf=" + cpf + ", matricula="
                + matricula + ", salario=" + salario + "]";
    }
}
