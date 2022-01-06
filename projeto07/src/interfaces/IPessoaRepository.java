package interfaces;

import entities.Pessoa;

public interface IPessoaRepository {
    //métodos abstratos
    //em uma interface, estes métodos já são
    //implicitamente publicos e abstratos
    void exportar(Pessoa pessoa) throws Exception;
}
