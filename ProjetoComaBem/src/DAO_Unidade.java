import java.sql.*;
import java.sql.PreparedStatement;

public class DAO_Unidade {

    Connection conexao;

    public void consulta() {
        try {
            conexao = new Conexao().getConexao();
            String sql = "SELECT * FROM unidade";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\nDados de UNIDADE\n");
            while (rs.next()) {
                System.out.println("------------------------------------------");
                System.out.println("Código ------ " + rs.getString(1));
                System.out.println("Medida ------ " + rs.getString(2));
            }
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro CONSULTA em UNIDADE: " + e);
        }
    }

    public boolean inserir(Unidade u1) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "INSERT INTO unidade VALUES(default,?)";
            PreparedStatement pst = conexao.prepareStatement(sql);

            pst.setString(1, u1.getUni_medida());

            pst.execute();
            this.conexao.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro INSERIR em UNIDADE: " + e);
            return false;
        }
    }

    public void alterar(Unidade u1) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "UPDATE unidade SET " +
                    "uni_medida = ? ";
            sql = sql + "WHERE uni_cod = ?";
            PreparedStatement pst = conexao.prepareStatement(sql);

            pst.setString(1, u1.getUni_medida());
            pst.setInt(2, u1.getUni_cod());

            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ALTERAR em UNIDADE: " + e);
        }
    }
    public void excluir(Unidade u1) {
        try {
            conexao = new Conexao().getConexao();
            String sql = "DELETE FROM unidade WHERE uni_cod = ?";
            PreparedStatement pst = conexao.prepareStatement(sql);

            pst.setInt(1, u1.getUni_cod());
            pst.execute();
            this.conexao.close();
        } catch (Exception e) {
            System.out.println("Erro EXCLUIR em UNIDADE: " + e);
        }
    }
}
