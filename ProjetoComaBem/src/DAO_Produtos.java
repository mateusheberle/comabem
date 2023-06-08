import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO_Produtos {

    Connection conexao;

    public void consulta() {
        try {
            conexao = new Conexao().getConexao();
            String sql  = "SELECT * FROM produtos";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\nDados de PRODUTOS\n");
            while (rs.next()) {
                System.out.println("------------------------------------------");
                System.out.println("Código ------ " + rs.getString(1));
                System.out.println("Nome -------- " + rs.getString(2));
                System.out.println("Valor ------- " + rs.getString(3));
                System.out.println("Quantidade -- " + rs.getString(4));
                System.out.println("Cod unidade - " + rs.getString(5));
            }
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro CONSULTA em PRODUTOS: " + e);
        }
    }

    public boolean inserir(Produtos p1) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "INSERT INTO produtos VALUES(default,?,?,?,?)";
            PreparedStatement pst = conexao.prepareStatement(sql);

            pst.setString(1, p1.getProd_nome());
            pst.setDouble(2, p1.getProd_valor());
            pst.setDouble(3, p1.getProd_quantidade());
            pst.setInt(4, p1.getUni_cod());

            pst.execute();
            this.conexao.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro INSERIR em PRODUTOS: " + e);
            return false;
        }
    }

    public void alterar(Produtos p1) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "UPDATE produtos SET " +
                    "prod_nome = ?," +
                    "prod_valor = ?," +
                    "prod_quantidade = ?," +
                    "UNIDADE_uni_cod = ? ";
            sql = sql + "WHERE prod_cod = ?";
            PreparedStatement pst = conexao.prepareStatement(sql);

            pst.setString(1, p1.getProd_nome());
            pst.setDouble(2, p1.getProd_valor());
            pst.setDouble(3, p1.getProd_quantidade());
            pst.setInt(4, p1.getUni_cod());
            pst.setInt(5, p1.getProd_cod());

            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ALTERAR em PRODUTOS: " + e);
        }
    }

    public void excluir(Produtos p1) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "DELETE FROM produtos WHERE prod_cod = ?";
            PreparedStatement pst = conexao.prepareStatement(sql);

            pst.setInt(1, p1.getProd_cod());

            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro EXCLUIR em PRODUTOS: " + e);
        }
    }

}
