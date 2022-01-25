public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getIdentificador() {
        return this.matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

