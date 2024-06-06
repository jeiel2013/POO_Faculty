import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO {
    
    public void insertMySQL(String nome, String categoria, String descricao, String codBarras, String marca, double preco, double peso) {
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        if (connection != null) {
            try {
                String campos = "NOME, CATEGORIA, DESCRICAO, CODIGOBARRAS, MARCA, PESO, PRECO, DATACAD";
                String valores = "?, ?, ?, ?, ?, ?, ?, ?";
                String sql = "INSERT INTO produtos ("+ campos +") VALUES (" + valores + ")";
                
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, nome);
                statement.setString(2, categoria);
                statement.setString(3, descricao);
                statement.setString(4, codBarras);
                statement.setString(5, marca);
                statement.setDouble(6, preco);
                statement.setDouble(7, peso);
                statement.setDate(8, java.sql.Date.valueOf(java.time.LocalDate.now()));
                
                int qtdeCad = statement.executeUpdate();
                if (qtdeCad > 0) {
                    System.out.println("Produto cadastrado com sucesso!");
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
                String query = "SELECT * FROM produto";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("Dados: " + resultSet.getString("NOME"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
    }
}
