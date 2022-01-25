import entities.Funcionario;
import inputs.FuncionarioInput;
import repositories.FuncionarioRepository;

import javax.swing.*;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        //criando os objetos
        Funcionario funcionario = new Funcionario();
        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();

        try {
            System.out.println("\nCONTROLE DE FUNCIONARIOS\n");
            System.out.println("(1) - CADASTRAR FUNCIONÁRIO");
            System.out.println("(2) - ATUALIZAR FUNCIONÁRIO");
            System.out.println("(3) - EXCLUIR FUNCIONÁRIO");
            System.out.println("(4) - CONSULTAR FUNCIONÁRIOS");
            String opcao = JOptionPane.showInputDialog("Entre com a opção desejada: ");
            //cadastrar funcionário
            if(opcao.equals("1")) {
                System.out.println("\nOpção selecionada: CADASTRO DE FUNCIONÁRIO:");

                //CADASTRO DE FUNCIONARIO
                funcionario.setNome(FuncionarioInput.lerNome());
                funcionario.setCpf(FuncionarioInput.lerCpf());
                funcionario.setMatricula(FuncionarioInput.lerMatricula());
                funcionario.setSalario(FuncionarioInput.lerSalario());
                //gravando o funcionario no banco de dados
                funcionarioRepository.inserir(funcionario);
                System.out.println("\nDADOS GRAVADOS COM SUCESSO!");
            }
            //atualizar funcionário
            else if(opcao.equals("2")) {
                System.out.println("\nOpção selecionada: ATUALIZAÇÃO DE FUNCIONÁRIO:");
                Integer idFuncionario = FuncionarioInput.lerIdFuncionario();
                //consultando o funcionario no banco de
                //dados atraves do ID..
                funcionario = funcionarioRepository.obterPorId(idFuncionario);
                //verificar se o funcionario foi encontrado no banco de dados
                if(funcionario != null) {
                    funcionario.setNome(FuncionarioInput.lerNome());
                    funcionario.setCpf(FuncionarioInput.lerCpf());
                    funcionario.setMatricula(FuncionarioInput.lerMatricula());
                    funcionario.setSalario(FuncionarioInput.lerSalario());
                    funcionarioRepository.alterar(funcionario);
                    System.out.println("\nDADOS ATUALIZADOS COM SUCESSO!");
                }
                else {
                    System.out.println("\nFuncionário não foi encontrado na base de dados.");
                }
            }
            //excluir o funcionario
            else if(opcao.equals("3")) {
                System.out.println("\nOpção selecionada: EXCLUSÃO DE FUNCIONÁRIO:");
                Integer idFuncionario = FuncionarioInput.lerIdFuncionario();
                //consultando o funcionario no banco
                //de dados atraves do ID..
                funcionario = funcionarioRepository
                        .obterPorId(idFuncionario);
                //verificar se o funcionario foi encontrado
                if(funcionario != null) {
                //excluir o funcionário no banco de dados
                    funcionarioRepository.excluir(funcionario);
                    System.out.println
                            ("\nFUNCIONÁRIO EXCLUÍDO COM SUCESSO.");
                }
                else {
                    System.out.println("\nFuncionário não foi encontrado na base de dados.");
                }
            }
            //consultar funcionarios
            else if(opcao.equals("4")) {
                System.out.println("\nOpção selecionada: CONSULTA DE FUNCIONÁRIOS:");
                //consultar todos os funcionarios cadastrados
                //na base de dados..
                List<Funcionario> funcionarios = funcionarioRepository.consultar();
                //imprimir cada funcionario
                for (Funcionario f : funcionarios) {
                    System.out.println("Id do Funcionário...: " + f.getIdFuncionario());
                    System.out.println("Nome................: " + f.getNome());
                    System.out.println("CPF.................: " + f.getCpf());
                    System.out.println("Matrícula...........: " + f.getMatricula());
                    System.out.println("Salário.............: " + f.getSalario());
                    System.out.println("---");
                }
            }
        }
        catch(Exception e) {
            //exibir mensagem de erro
            System.out.println("\nErro: " + e.getMessage());
        }
    }
}
