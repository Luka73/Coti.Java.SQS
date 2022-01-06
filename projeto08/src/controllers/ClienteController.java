package controllers;

import entities.Cliente;
import inputs.ClienteInput;
import interfaces.IClienteRepository;

public class ClienteController {
    //atributo
    private IClienteRepository clienteRepository;
    //construtor com entrada de argumentos
    public ClienteController(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    //método para realizar a exportação dos dados para arquivos
    public void realizarExportacao() {
        try {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(ClienteInput.lerIdCliente());
            cliente.setNome(ClienteInput.lerNome());
            cliente.setEmail(ClienteInput.lerEmail());
            cliente.setCpf(ClienteInput.lerCpf());
            //realizando a exportação..
            clienteRepository.exportar(cliente);
            System.out.println("\nDados gravados com sucesso!");
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
