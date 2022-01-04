package inputs;

import enums.TipoContratacao;

import javax.swing.*;

public class FuncionarioInput {

    public static Integer lerIdFuncionario() throws Exception {
        String valor = JOptionPane.showInputDialog("Entre com o Id do funcionário:");
        return Integer.parseInt(valor);
    }
    public static String lerNome() throws Exception {
        return JOptionPane.showInputDialog("Entre com o Nome do funcionário:");
    }
    public static String lerCpf() throws Exception {
        return JOptionPane.showInputDialog("Entre com o CPF do funcionário:");
    }

    public static String lerMatricula() throws Exception {
        return JOptionPane.showInputDialog("Entre com a Matricula do funcionário:");
    }

    public static TipoContratacao lerTipoContratacao() throws Exception {
        String valor = JOptionPane.showInputDialog
                ("Entre com o Tipo de contratação:");
        switch (valor.toUpperCase()) {
            case "ESTAGIO":
                return TipoContratacao.ESTAGIO;
            case "CLT":
                return TipoContratacao.CLT;
            case "TERCEIRIZADO":
                return TipoContratacao.TERCEIRIZADO;
            default:
                throw new Exception("Tipo de contratação inválido.");
        }
    }
}
