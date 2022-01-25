package interfaces;

import entities.Funcionario;

import java.util.List;

public interface IFuncionarioRepository {
    void inserir(Funcionario funcionario) throws Exception;
    void alterar(Funcionario funcionario) throws Exception;
    void excluir(Funcionario funcionario) throws Exception;
    List<Funcionario> consultar() throws Exception;
    Funcionario obterPorId(Integer idFuncionario) throws Exception;
}
