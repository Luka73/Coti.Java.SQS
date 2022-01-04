package input;

import javax.swing.*;

public class ClienteInput {
    // método para ler o id do cliente
    public Integer lerIdCliente() throws Exception {
        String valor = JOptionPane.showInputDialog
                ("Informe o ID do Cliente:");
        return Integer.parseInt(valor);
    }
    // método para ler o nome do cliente
    public String lerNome() throws Exception {
        return JOptionPane.showInputDialog
                ("Informe o NOME do Cliente:");
    }
    // método para ler o email do cliente
    public String lerEmail() throws Exception {
        return JOptionPane.showInputDialog
                ("Informe o EMAIL do Cliente:");
    }
    // método para ler o cpf do cliente
    public String lerCpf() throws Exception {
        return JOptionPane.showInputDialog
                ("Informe o CPF do Cliente:");
    }
}
