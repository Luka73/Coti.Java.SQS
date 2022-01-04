package entities;

public class Cliente {
    // atributos (dados)
    private Integer idCliente;
    private String nome;
    private String email;
    private String cpf;

    public Cliente() {

    }
    public Cliente(Integer idCliente, String nome, String email, String cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", nome="
                + nome + ", email=" + email + ", cpf=" + cpf + "]";
    }
}
