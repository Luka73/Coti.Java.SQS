import controllers.ClienteController;
import repositories.ClienteRepositoryJSON;
import repositories.ClienteRepositoryXML;

import javax.swing.JOptionPane;

public class Programa {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog("Informe XML ou JSON:");

        ClienteController clienteController = null; //vazio..
        if(opcao.equalsIgnoreCase("XML")) {
        //POLIMORFISMO!
            clienteController = new ClienteController(new ClienteRepositoryXML());
            clienteController.realizarExportacao();
        }
        else if(opcao.equalsIgnoreCase("JSON")) {
        //POLIMORFISMO!
            clienteController = new ClienteController(new ClienteRepositoryJSON());
            clienteController.realizarExportacao();
        }
        else {
            System.out.println("Opção inválida.");
        }
    }
}
