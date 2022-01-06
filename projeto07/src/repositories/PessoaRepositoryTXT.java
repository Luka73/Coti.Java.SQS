package repositories;

import entities.Pessoa;
import interfaces.IPessoaRepository;

import java.io.PrintWriter;

public class PessoaRepositoryTXT implements IPessoaRepository {

    @Override
    public void exportar(Pessoa pessoa) throws Exception {
        PrintWriter print = new PrintWriter("c:\\temp\\pessoa.txt");
        print.write(pessoa.toString());
        print.flush();
        print.close();
    }
}
