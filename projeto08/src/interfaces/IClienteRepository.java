package interfaces;

import entities.Cliente;

public interface IClienteRepository {
    //métodos abstratos
    void exportar(Cliente cliente) throws Exception;
}
