package repositories;

import entities.Pessoa;
import interfaces.IPessoaRepository;

import java.io.PrintWriter;

public class PessoaRepositoryCSV implements IPessoaRepository {

    @Override
    public void exportar(Pessoa pessoa) throws Exception {
        PrintWriter print = new PrintWriter("c:\\temp\\pessoa.csv");
        print.write(pessoa.getIdPessoa() + ";"
                + pessoa.getNome() + ";" + pessoa.getSobrenome() + "\n");
        print.flush();
        print.close();
    }
}
