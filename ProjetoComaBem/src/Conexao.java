import java.sql.*;

public class Conexao {

    Connection conexao;

    public Conexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/comabem",
                    "user_sistema",
                    "12345");
        } catch (Exception e) {
            System.out.println("Erro da conexao:" + e);
        }
    }

    public Connection getConexao(){
        return this.conexao;
    }

}


