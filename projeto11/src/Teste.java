public class Teste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("123", "Luana");
        Pessoa p1 = new Pessoa("432", "Fernando");

        System.out.println(a1.getIdentificador());
        System.out.println(p1.getIdentificador());

    }
}
