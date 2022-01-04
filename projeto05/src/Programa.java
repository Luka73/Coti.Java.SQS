import entities.Cliente;
import input.ClienteInput;
import repositories.ClienteRepository;

public class Programa {
    public static void main(String[] args) {
        try {
        Cliente cliente = new Cliente();
        ClienteInput input = new ClienteInput();
        cliente.setIdCliente(input.lerIdCliente());
        cliente.setNome(input.lerNome());
        cliente.setEmail(input.lerEmail());
        cliente.setCpf(input.lerCpf());

        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.exportarDados(cliente, "c:\\temp\\cliente.txt");

        System.out.println("\nArquivo TXT gerado com sucesso");
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
