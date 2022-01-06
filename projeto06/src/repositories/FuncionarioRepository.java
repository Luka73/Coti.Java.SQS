package repositories;

import entities.Funcionario;
import interfaces.IFuncionarioRepository;

import java.io.PrintWriter;

public class FuncionarioRepository implements IFuncionarioRepository {

    @Override
    public void exportar(Funcionario funcionario) throws Exception {
        PrintWriter print = new PrintWriter("c:\\temp\\funcionario.txt");
        print.write(funcionario.toString());
        print.flush();
        print.close();
    }
}
