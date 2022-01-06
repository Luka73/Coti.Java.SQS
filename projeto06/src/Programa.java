import entities.Funcionario;
import inputs.FuncionarioInput;
import repositories.FuncionarioRepository;

public class Programa {
    public static void main(String[] args) {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario(FuncionarioInput.lerIdFuncionario());
            funcionario.setNome(FuncionarioInput.lerNome());
            funcionario.setCpf(FuncionarioInput.lerCpf());
            funcionario.setMatricula(FuncionarioInput.lerMatricula());
            funcionario.setTipo(FuncionarioInput.lerTipoContratacao());

            FuncionarioRepository repository = new FuncionarioRepository();
            repository.exportar(funcionario);

            System.out.println("\nDados gravados com sucesso!");
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
