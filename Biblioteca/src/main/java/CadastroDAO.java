import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroDAO {
    
    public void insertMySQL(String titulo, String autor, String genero, String editora, int anoPublicacao) {
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        if (connection != null) {
            try {
                String campos = "TITULO, AUTOR, GENERO, EDITORA, ANOPUBLICACAO";
                String valores = "?, ?, ?, ?, ?";
                String sql = "INSERT INTO livro ("+ campos +") VALUES (" + valores + ")";
                
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, titulo);
                statement.setString(2, autor);
                statement.setString(3, genero);
                statement.setString(4, editora);
                statement.setInt(5, anoPublicacao);
                
                int qtdeCad = statement.executeUpdate();
                if (qtdeCad > 0) {
                    System.out.println("Livro cadastrado com sucesso!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
    }
    
     public static void selecionarProdutos() {
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        if (connection != null) {
            try {
                String query = "SELECT * FROM SUATABELA";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("Dados: " + resultSet.getString("SEUCAMPO"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
    }
}
