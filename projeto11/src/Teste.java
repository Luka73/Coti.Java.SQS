public class Teste {

    public static void print_identificador(Identificavel identificavel) {
        System.out.println(identificavel.getIdentificador());
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("123", "Luana");
        Pessoa p1 = new Pessoa("432", "Fernando");

        print_identificador(a1);
        print_identificador(p1);
    }
}
