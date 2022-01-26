public class Pessoa implements Identificavel{
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getIdentificador() {
        return this.cpf;
    }
}
