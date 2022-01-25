package inputs;

import javax.swing.JOptionPane;

public class FuncionarioInput {
    public static Integer lerIdFuncionario() throws Exception {
        String valor = JOptionPane.showInputDialog("Entre com o Id do Funcionário:");
        return Integer.parseInt(valor);
    }

    public static String lerNome() throws Exception {
        return JOptionPane.showInputDialog("Entre com o nome do Funcionário:");
    }

    public static String lerCpf() throws Exception {
        return JOptionPane.showInputDialog("Entre com o cpf do Funcionário:");
    }

    public static String lerMatricula() throws Exception {
        return JOptionPane.showInputDialog("Entre com a matricula do Funcionário:");
    }

    public static Double lerSalario() throws Exception {
        String valor = JOptionPane.showInputDialog("Entre com o salário do Funcionário:");
        return Double.parseDouble(valor);
    }
}
