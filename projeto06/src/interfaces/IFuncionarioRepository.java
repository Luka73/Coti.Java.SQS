package interfaces;

import entities.Funcionario;

public interface IFuncionarioRepository {
    //métodos abstratos (sem corpo)
    public void exportar(Funcionario funcionario) throws Exception;
}
