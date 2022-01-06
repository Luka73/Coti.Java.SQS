package repositories;

import entities.Cliente;
import interfaces.IClienteRepository;
import org.json.simple.JSONObject;

import java.io.PrintWriter;
import java.util.HashMap;

public class ClienteRepositoryJSON implements IClienteRepository {
    @Override
    public void exportar(Cliente cliente) throws Exception {
        HashMap<String, Object> mapa = new HashMap<String, Object>();
        mapa.put("idCliente", cliente.getIdCliente());
        mapa.put("nome", cliente.getNome());
        mapa.put("email", cliente.getEmail());
        mapa.put("cpf", cliente.getCpf());
        //transformando o conteudo em JSON
        JSONObject json = new JSONObject(mapa);
        //gravar em arquivo..
        PrintWriter print = new PrintWriter("c:\\temp\\cliente.json");
        print.write(json.toJSONString());
        print.flush();
        print.close();
    }
}
