import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {

    private final static String url = "jdbc:mysql://localhost:3306/avaliacao_2?useTimezone=true&serverTimezone=UTC";
    private final static String user = "root";
    private final static String password = "";

    private static String telefone;
    private int id;
    private ArrayList<Receita> receitas = new ArrayList<>();

    protected Cliente(
        int id,
        String nome, 
        String cpf, 
        String dataDeNascimento,
        String telefone
        ) {
        super(nome, cpf, dataDeNascimento);
        this.telefone = telefone;
    }

    public int getId(){
        return this.id;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceitas() {
        return this.receitas;
    }
    
    @Override
    public String carteira(){
        return "\nNome cliente: " + this.getNome()
            + "\nCPF: " + this.getCpf()
            + "\nData Nascimneto: " + this.getDataDeNascimento()
            + "\nTelefone: " + this.getTelefone();
    }

    public static void printCliente(
        ArrayList<Cliente> clientes
    ) {
        try {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Cliente getCliente() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe ID do Cliente para exclusão: \n");
            int id = scanner.nextInt();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM cliente WHERE id = " + id);

            if(!rs.next()) {
                throw new Exception("Id invalido");
            }
            scanner.close();
            return new Cliente(
                rs.getInt("id_cliente"),
                rs.getString("nome"), 
                rs.getString("cpf"), 
                rs.getString("data_nasc"), 
                rs.getString("telefone")
            );
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }    
    }    
    
    public static ArrayList<Cliente> getClientes() throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM cliente;");
            ArrayList<Cliente> clientes = new ArrayList<>();
            while (rs.next()) {
                clientes.add(
                    new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("nome"), 
                        rs.getString("cpf"), 
                        rs.getString("data_nasc"), 
                        rs.getString("telefone")
                    )
                );
            }
            con.close();
            return clientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    
    public static Cliente getClienteInsert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do Cliente: \n");
        int id = scanner.nextInt();
        System.out.println("Informe o nome do Cliente: \n");
        String nome = scanner.next();
        System.out.println("Informe o CPF do Cliente: \n");
        String cpf = scanner.next();
        System.out.println("Informe a data de nascimento do Cliente? \n");
        String dataDeNascimento = scanner.next();
        System.out.println("Informe o telefone do Cliente: \n");
        String telefone = scanner.next();
        scanner.close();

        return new Cliente(
            id,
            nome,
            cpf,
            dataDeNascimento,
            telefone
            );
    }        

        
    public static void insertCliente(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.executeQuery("INSERT INTO cliente"
                + "(nome, cpf, data_nasc, especialidade, salario) VALUES "
                + "('"+cliente.getNome()+"', '"+cliente.getCpf()+"', '"+cliente.getDataDeNascimento()+"', '"+cliente.getTelefone()+"')") != null;
            if(!sql) {
                System.out.println("Falha!");
            }
            con.close();
            System.out.println("Registro Salvo!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Cliente getClienteUpdate() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            Cliente cliente = Cliente.getCliente();
            System.out.println("Informe o nome do Cliente (Deixar em branco para manter \n)");
            String nome = scanner.next();
            if (nome == null){
                cliente.setNome(nome);
            }        
            System.out.println("Informe o CPF do Cliente (Deixar em branco para manter \n)");
            String cpf = scanner.next();
            if (cpf == null){
                cliente.setCpf(cpf);
            }        
            System.out.println("Informe a data de nascimento do Cliente (Deixar em branco para manter \n)");
            String dataDeNascimento = scanner.next();
            if (dataDeNascimento == null){
                cliente.setDataDeNascimento(dataDeNascimento);
            }        
            System.out.println("Informe o telefone do Cliente (Deixar em branco para manter \n)");
            String especialidade = scanner.next();
            if (especialidade == null){
                cliente.setTelefone(telefone);
            }       
            scanner.close();
            return cliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } 
    }

    public static void updateCliente(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("UPDATE cliente SET "
                + " nome = '" + cliente.getNome() + "'"
                + ", cpf = '" + cliente.getCpf() + "'"
                + ", data_nasc = '" + cliente.getDataDeNascimento() + "'"
                + ", telefone = '" + cliente.getTelefone() + "'"
                + " WHERE id = " + cliente.getId());
            if(!sql) {
                System.out.println("Falhou!");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteCliente(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("DELETE FROM cliente"
                + "WHERE id = " + cliente.getId());
            if(!sql) {
                System.out.println("Falhou!");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
