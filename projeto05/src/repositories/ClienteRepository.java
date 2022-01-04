package repositories;

import entities.Cliente;

import java.io.File;
import java.io.PrintWriter;

public class ClienteRepository {
    //método para receber um objeto da classe Cliente (entidade)
    //e exportar os dados para um arquivo de extensão TXT
    public void exportarDados(Cliente cliente, String path) throws Exception {
        //abrindo o arquivo em modo de escrita
        PrintWriter print = new PrintWriter(new File(path));
        //gravando os dados no arquivo
        print.write("\nDADOS DO CLIENTE:\n");
        print.write("\nId do Cliente: " + cliente.getIdCliente());
        print.write("\nNome.........: " + cliente.getNome());
        print.write("\nEmail........: " + cliente.getEmail());
        print.write("\nCPF..........: " + cliente.getCpf());
        //fechando o arquivo
        print.flush();
        print.close();
    }
}
