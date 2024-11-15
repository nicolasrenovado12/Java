package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program_A {
    public static void main(String[] args) {
        // Configurações de conexão
        String dbHost = "localhost";       // Host do MySQL
        String dbUser = "root";            // Nome de usuário do MySQL
        String dbPassword = "";            // Senha do MySQL (deixe vazio se não houver senha)
        String dbName = "usuarios";        // Nome do banco de dados

        // URL de conexão JDBC
        String url = "jdbc:mysql://" + dbHost + ":3306/" + dbName;

        // Estabelecendo conexão
        try {
            Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);
            System.out.println("Conexão bem-sucedida!");

            // Fechar a conexão
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados.");
            e.printStackTrace();
        }
    }
}
