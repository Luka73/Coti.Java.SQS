package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entities.Funcionario;
import factories.ConnectionFactory;
import interfaces.IFuncionarioRepository;

public class FuncionarioRepository implements IFuncionarioRepository {

    @Override
    public void inserir(Funcionario funcionario) throws Exception {
        //escrevendo o comando SQL que será executado
        //na base de dados (query)
        String sql = "insert into funcionario (nome, cpf, matricula, salario) values(?, ?, ?, ?)";
        //abrindo conexão com a base de dados..
        Connection connection = ConnectionFactory .createConnection();
        //executando o comando SQL e passar os seus parametros
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, funcionario.getNome());
        statement.setString(2, funcionario.getCpf());
        statement.setString(3, funcionario.getMatricula());
        statement.setDouble(4, funcionario.getSalario());
        //executando no banco de dados
        statement.execute();
        statement.close();
        //fechando a conexão
        connection.close();
    }

    @Override
    public void alterar(Funcionario funcionario) throws Exception {
        String sql = "update funcionario set nome = ?, cpf = ?, matricula = ? salario = ? where idfuncionario = ?";
        Connection connection = ConnectionFactory.createConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, funcionario.getNome());
        statement.setString(2, funcionario.getCpf());
        statement.setString(3, funcionario.getMatricula());
        statement.setDouble(4, funcionario.getSalario());
        statement.setInt(5, funcionario.getIdFuncionario());
        statement.execute();
        statement.close();
        connection.close();
    }

    @Override
    public void excluir(Funcionario funcionario) throws Exception {
        String sql = "delete from funcionario where idfuncionario = ?";
        Connection connection = ConnectionFactory.createConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, funcionario.getIdFuncionario());
        statement.execute();
        statement.close();
        connection.close();
    }

    @Override
    public List<Funcionario> consultar() throws Exception {
        String sql = "select * from funcionario";
        Connection connection = ConnectionFactory.createConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        while(resultSet.next()) {
            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario(resultSet.getInt("idfuncionario"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setCpf(resultSet.getString("cpf"));
            funcionario.setMatricula(resultSet.getString("matricula"));
            funcionario.setSalario(resultSet.getDouble("salario"));
            funcionarios.add(funcionario);
        }
        resultSet.close();
        statement.close();
        connection.close();
        return funcionarios;
    }

    @Override
    public Funcionario obterPorId(Integer idFuncionario) throws Exception {
        String sql = "select * from funcionario where idfuncionario = ?";
        Connection connection = ConnectionFactory.createConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idFuncionario);
        ResultSet resultSet = statement.executeQuery();
        Funcionario funcionario = null; //vazio
        if(resultSet.next()) {
            funcionario = new Funcionario();
            funcionario.setIdFuncionario(resultSet.getInt("idfuncionario"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setCpf(resultSet.getString("cpf"));
            funcionario.setMatricula(resultSet.getString("matricula"));
            funcionario.setSalario(resultSet.getDouble("salario"));
        }
        resultSet.close();
        statement.close();
        connection.close();
        return funcionario;
    }
}
