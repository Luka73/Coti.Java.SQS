package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    // atributos utilizados para configurar os parametros de conexão
    //URL de conexão com o banco de dados e os
    //parâmetros necessários para estabelecer conexão
    private static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/aula10?useTimezone=true&serverTimezone=UTC&useSSL=false";
    //Usuário do banco de dados (root -> nome do usuário administrador do MySQL)
    private static final String DATABASE_USER = "root";
    //Senha do Usuário do banco de dados
    private static final String DATABASE_PASSWORD = "root";
    // método para abrir e retornar uma conexão com o banco de dados
    public static Connection createConnection() throws Exception {
        return DriverManager.getConnection
                (DATABASE_HOST, DATABASE_USER, DATABASE_PASSWORD);
    }
}
