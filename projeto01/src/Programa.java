public class Programa {
    //método (função) para executar o projeto JAVA.
    //main + [CTRL] + [ESPAÇO]
    public static void main(String[] args) {
        //syso + [CTRL] + [ESPAÇO]
        System.out.println("Aula 01 - Java Developer COTI Informática");
        //criando um objeto da classe Cliente..
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNome("Sergio Mendes");
        cliente.setEmail("sergio.coti@gmail.com");
        cliente.setCpf("123.456.789-00");

        System.out.println("\nDADOS DO CLIENTE:\n");
        System.out.println("ID……..: " + cliente.getIdCliente());
        System.out.println("NOME..: " + cliente.getNome());
        System.out.println("EMAIL.: " + cliente.getEmail());
        System.out.println("CPF...: " + cliente.getCpf());
    }
}
