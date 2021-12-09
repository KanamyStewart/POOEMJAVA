package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conexao {
    public static Connection getConnection() throws Exception {
        try {
            Properties props = getProps();
            final String url = "jdbc:mysql://localhost:3306/avaliacao_2";
            final String user = "root";
            final String password = "";

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProps() throws IOException {
        Properties props = new Properties();
        String path = "/exercicios/bancodedados/conexao.properties";
        props.load(Conexao.class.getResourceAsStream(path));
        return props;
    }

    public static void createLeao(
        Connection conexao,
        String nome, 
        String alimentacao, 
        String visitantes,
        int jaula_id
    ) throws Exception {
        String sql = "INSERT INTO leao " + 
                        "(nome, alimentacao, visitantes, jaula_id) " + 
                    "VALUES(?,?,?)";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, alimentacao);
            statement.setString(3, visitantes);
            statement.setInt(4, jaula_id);
            
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void updateLeao(
        Connection conexao,
        String nome, 
        String alimentacao, 
        String visitantes,
        int jaula_id
    ) throws Exception {
        String sql = "UPDATE leao " + 
                        "SET nome = ?" + 
                        "alimentacao = ?" +
                        "visitantes = ?" +
                        "jaula_id = ?" +
                    "WHERE id = ?";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, alimentacao);
            statement.setString(3, visitantes);
            statement.setInt(4, jaula_id);
            
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void removeLeao(
        Connection conexao,
        int id
    ) throws Exception {
        String sql = "DELETE FROM leao " + 
                    "WHERE id = ?";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void findLeao(Connection conexao) throws Exception {
        String sql = "SELECT * FROM leao";
        Statement statemente = conexao.createStatement();
        ResultSet resultados = statemente.executeQuery(sql);

        while(resultados.next()){
            statemente.execute("SELECT * FROM alimentacao WHERE id = " + resultados.getInt("alimentacao"));
            statemente.execute("SELECT * FROM jaula WHERE id = " + resultados.getInt("jaula_id"));
            Leao leao = new Leao(
                resultados.getInt("id"), 
                resultados.getString("nome"), 
                resultados.getInt("alimentacao"), 
                resultados.getInt("visitantes"), 
                resultados.getInt("jaula_id")
                );
            System.out.println(leao);
        }
    }

    public static void createGolfinho(
        Connection conexao,
        String nome, 
        String treinamento,
        int jaula_id
    ) throws Exception {
        String sql = "INSERT INTO golfinho " + 
                        "(nome, treinamento, jaula_id) " + 
                    "VALUES(?,?,?)";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(3, treinamento);
            statement.setInt(4, jaula_id);
            
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void updateGolfinho(
        Connection conexao,
        String nome, 
        String treinamento,
        int jaula_id
    ) throws Exception {
        String sql = "UPDATE golfinho " + 
                        "SET nome = ?" + 
                        "treinamento = ?" +
                        "jaula_id = ?" +
                    "WHERE id = ?";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, treinamento);
            statement.setInt(3, jaula_id);
            
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void removeGolfinho(
        Connection conexao,
        int id
    ) throws Exception {
        String sql = "DELETE FROM golfinho " + 
                    "WHERE id = ?";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void findGolfinho(Connection conexao) throws Exception {
        String sql = "SELECT * FROM golfinho";
        Statement statemente = conexao.createStatement();
        ResultSet resultados = statemente.executeQuery(sql);

        while(resultados.next()){
            statemente.execute("SELECT * FROM jaula WHERE id = " + resultados.getInt("jaula_id"));
            statemente.execute("SELECT * FROM treinamento WHERE id = " + resultados.getInt("treinamento"));
            Golfinho golfinho = new Golfinho(
                resultados.getInt("id"), 
                resultados.getString("nome"), 
                resultados.getInt("treinamento"), 
                resultados.getInt("jaula_id")
                );
            System.out.println(golfinho);
        }
    }
}
