import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Home {
    
    public static void main(String[] args) {
        try{
            final String url = "jdbc:mysql://localhost:3306/aula_java?useTimezone=true&serverTimezone=UTC";
            final String user = "root";
            final String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Banco de dados conectado");
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
