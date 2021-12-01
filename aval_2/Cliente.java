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

    protected Cliente(
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
    public String toString(){
        return "Nome cliente: " + this.getNome()
            + ", CPF: " + this.getCpf()
            + ", Data Nascimneto: " + this.getDataDeNascimento()
            + ", Telefone: " + this.getTelefone();
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

    public static Cliente getCliente(Scanner scanner) throws Exception {
        try {
            System.out.println("Informe ID do Cliente: ");
            int id = scanner.nextInt();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM cliente WHERE id = " + id);

            if(!rs.next()) {
                throw new Exception("Id invalido");
            }
            
            return new Cliente(
                rs.getInt("id"),
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
                        rs.getInt("id"),
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

    
    public static Cliente getClienteInsert(Scanner scanner) {
        System.out.println("Informe o nome do Cliente: ");
        String nome = scanner.next();
        System.out.println("Informe o CPF do Cliente: ");
        String cpf = scanner.next();
        System.out.println("Informe a data de nascimento do Cliente ");
        String dataDeNascimento = scanner.next();
        System.out.println("Informe o telefone do Cliente: ");
        String telefone = scanner.next();
        return new Cliente(
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
            stm.execute("INSERT INTO cliente"
                + "(nome, cpf, data_nasc, telefone) VALUES "
                + "('"+cliente.getNome()+"', '"+cliente.getCpf()+"', '"+cliente.getDataDeNascimento()+"', '"+cliente.getTelefone()+"')");
            con.close();
            System.out.println("Registro Salvo!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Cliente getClienteUpdate(Scanner scanner) throws Exception {
        try {
            Cliente cliente = Cliente.getCliente(scanner);
            System.out.println("Informe o nome do Cliente (Deixar em branco para manter)");
            String nome = scanner.next();
            if (nome.length() > 0){
                cliente.setNome(nome);
            }        
            System.out.println("Informe o CPF do Cliente (Deixar em branco para manter)");
            String cpf = scanner.next();
            if (cpf.length() > 0){
                cliente.setCpf(cpf);
            }        
            System.out.println("Informe a data de nascimento do Cliente (Deixar em branco para manter)");
            String dataDeNascimento = scanner.next();
            if (dataDeNascimento.length() > 0){
                cliente.setDataDeNascimento(dataDeNascimento);
            }        
            System.out.println("Informe o telefone do Cliente (Deixar em branco para manter)");
            String telefone = scanner.next();
            if (telefone.length() > 0){
                cliente.setTelefone(telefone);
            }
            return cliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } 
    }

    public static void updateCliente(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("UPDATE cliente SET "
                + " nome = '" + cliente.getNome() + "'"
                + ", cpf = '" + cliente.getCpf() + "'"
                + ", data_nasc = '" + cliente.getDataDeNascimento() + "'"
                + ", telefone = '" + cliente.getTelefone() + "'"
                + " WHERE id = " + cliente.getId());
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteCliente(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("DELETE FROM cliente WHERE id = " + cliente.getId());
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String carteira() {
        
        return null;
    }
}
