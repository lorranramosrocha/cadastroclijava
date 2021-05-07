package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 169121742020.2
 */
public class Conexao {
    public static Connection getConexao(){
        try {
        Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientes","root","");
            System.out.println("Conectado com sucesso!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!\nError: "+ e);
        } 
        return null;
    }
   
}
