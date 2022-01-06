package input;

import javax.swing.JOptionPane;

public class PessoaInput {

    public static Integer lerIdPessoa() throws Exception {
        String valor = JOptionPane.showInputDialog("Entre com ID:");
        return Integer.parseInt(valor);
    }
    public static String lerNome() throws Exception {
        return JOptionPane.showInputDialog("Entre com o NOME:");
    }
    public static String lerSobrenome() throws Exception {
        return JOptionPane.showInputDialog("Entre com o SOBRENOME:");
    }
}
