import entities.Funcionario;
import inputs.FuncionarioInput;

public class Programa {
    public static void main(String[] args) {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario(FuncionarioInput.lerIdFuncionario());
            funcionario.setNome(FuncionarioInput.lerNome());
            funcionario.setCpf(FuncionarioInput.lerCpf());
            funcionario.setMatricula(FuncionarioInput.lerMatricula());
            funcionario.setTipo(FuncionarioInput.lerTipoContratacao());
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
