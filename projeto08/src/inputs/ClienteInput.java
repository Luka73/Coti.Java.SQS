package inputs;

import javax.swing.JOptionPane;

public class ClienteInput {

    public static Integer lerIdCliente() throws Exception {
        String valor = JOptionPane.showInputDialog("Entre com o ID do cliente:");
        return Integer.parseInt(valor);
    }
    public static String lerNome() throws Exception {
        return JOptionPane.showInputDialog("Entre com o NOME do cliente:");
    }
    public static String lerEmail() throws Exception {
        return JOptionPane.showInputDialog("Entre com o EMAIL do cliente:");
    }

    public static String lerCpf() throws Exception {
        return JOptionPane.showInputDialog("Entre com o CPF do cliente:");
    }
}
