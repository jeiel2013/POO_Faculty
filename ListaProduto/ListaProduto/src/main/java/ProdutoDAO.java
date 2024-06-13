import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    
    public void insertMySQL(String nome, String categoria, String descricao, String codBarras, String marca, double preco, double peso) {
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        if (connection != null) {
            try {
                String campos = "NOME, CATEGORIA, DESCRICAO, CODIGOBARRAS, MARCA, PESO, PRECO, DATACAD";
                String valores = "?, ?, ?, ?, ?, ?, ?, ?";
                String sql = "INSERT INTO PRODUTOS ("+ campos +") VALUES (" + valores + ")";
                
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
    
    public List<Produto> selectMySQL() {
        List<Produto> produtos = new ArrayList<>();
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        if (connection != null) {
            try {
                String query = "SELECT * FROM produtos";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Produto prod = new Produto();
                    prod.setId(resultSet.getInt("IDPRODUTO"));
                    prod.setNome(resultSet.getString("NOME"));
                    prod.setCategoria(resultSet.getString("CATEGORIA"));
                    prod.setPreco(Double.parseDouble(resultSet.getString("PRECO")));
                    produtos.add(prod);
                    //System.out.println("Dados: " + resultSet.getString("NOME"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
        return produtos;
    }
     
     
    public int deleteMySQL(String idProduto) {
        int result = 0;
        MySQLConnection mysql = new MySQLConnection();
        Connection connection = mysql.getConexao();
        if (connection != null) {
            try {
                String query = "DELETE FROM produtos WHERE IDPRODUTO=" + idProduto;
                PreparedStatement statement = connection.prepareStatement(query);
                result = statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                mysql.desconectar();
            }
        }
        return result;
    }

}
