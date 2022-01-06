package controllers;

import entities.Pessoa;
import input.PessoaInput;
import interfaces.IPessoaRepository;

public class PessoaController {

    //atributo
    private IPessoaRepository pessoaRepository;
    //construtor com entrada de argumentos
    public PessoaController(IPessoaRepository pessoaRepository) {
        super();
        this.pessoaRepository = pessoaRepository;
    }
    public void realizarExportacao() {
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setIdPessoa(PessoaInput.lerIdPessoa());
            pessoa.setNome(PessoaInput.lerNome());
            pessoa.setSobrenome(PessoaInput.lerSobrenome());
            pessoaRepository.exportar(pessoa);
            System.out.println("\nDados gravados com sucesso!");
        }
        catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
