import entities.Funcao;
import entities.Funcionario;

import java.io.File;
import java.io.PrintWriter;
import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        //criando um objeto para a classe Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setIdPessoa(1);
        funcionario.setNome("Sergio Mendes");
        funcionario.setCpf("123.456.789-00");
        funcionario.setMatricula("2021-001");
        funcionario.setDataAdmissao(new Date());
        funcionario.setSalario(1000.0);
        //criando um objeto para a classe Funcao
        Funcao funcao = new Funcao();
        funcao.setIdFuncao(1);
        funcao.setNome("Programador");
        funcao.setDescricao("Desenvolvedor de sistemas");
        //associando funcionario com funcão
        funcionario.setFuncao(funcao);

        //gravar os dados do funcionario em arquivo..
        try { //tentativa
            //abrindo um arquivo em modo de gravação (escrita)
            PrintWriter print = new PrintWriter(new File("c:\\temp\\funcionario.txt"));
            print.write("\r\n Id..............: " + funcionario.getIdPessoa());
            print.write("\r\n Funcionário.....: " + funcionario.getNome());
            print.write("\r\n CPF.............: " + funcionario.getCpf());
            print.write("\r\n Matricula.......: " + funcionario.getMatricula());
            print.write("\r\n Data de Admissão: " + funcionario.getDataAdmissao());
            print.write("\r\n Salário.........: " + funcionario.getSalario());
            print.write("\r\n Nome da função..: " + funcionario.getFuncao().getNome());
            print.write("\r\n Descrição.......: " + funcionario.getFuncao().getDescricao());
            print.close();
            System.out.println("\nArquivo gravado com sucesso.");
        }
        catch(Exception e) { //captura da exceção
            System.out.println("\nErro: " + e.getMessage());
        }
    }
}
