import controllers.PessoaController;
import repositories.PessoaRepositoryCSV;
import repositories.PessoaRepositoryTXT;

import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        String tipo = JOptionPane.showInputDialog
                ("Informe o tipo de arquivo (TXT) ou (CSV):");
        PessoaController controller = null; //vazio
        if(tipo.equalsIgnoreCase("TXT")) {
            //POLIMORFISMO -> instanciando
            // a interface como TXT
            controller = new PessoaController(new PessoaRepositoryTXT());
            controller.realizarExportacao();
        }
        else if(tipo.equalsIgnoreCase("CSV")) {
        //POLIMORFISMO -> instanciando
        //a interface como TXT
            controller = new PessoaController(new PessoaRepositoryCSV());
            controller.realizarExportacao();
        }
        else {
            System.out.println("\nTipo inválido!");
        }
    }
}
