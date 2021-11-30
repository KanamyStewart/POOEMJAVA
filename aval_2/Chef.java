import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Chef extends Pessoa implements CalculoSalario{
    private String especialidae;
    private double salario;
    private int id;
    private ArrayList<Receita> receitas = new ArrayList<>();

    private final static String url = "jdbc:mysql://localhost:3306/avaliacao_2?useTimezone=true&serverTimezone=UTC";
    private final static String user = "root";
    private final static String password = "";

    protected Chef(
        int id,
        String nome, 
        String cpf, 
        String dataDeNascimento,
        String especialidade,
        double salario
        ) {
        super(nome, cpf, dataDeNascimento);
        this.id = id;
        this.especialidae = especialidade;
        this.salario = salario;
    }

    public int getId(){
        return this.id;
    }

    public void setEspecialidade(String especialidade){
        this.especialidae = especialidade;
    }

    public String getEspecialidade(){
        return this.especialidae;
    }

    public void setReceita(Receita receita){
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceitas(){
        return this.receitas;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof Chef)){
            return false;
        }
        Chef chef = (Chef) o;
        return this.getCpf() == chef.getCpf()
            && this.getReceitas() == chef.getReceitas()
            && this.getNome() == chef.getNome();
    }

    @Override
    public String carteira() {
        return "\nNome Chef: " + this.getNome() 
            + "\nCPF: " + this.getCpf() 
            + "\nData Nascimento: " + this.getDataDeNascimento()
            + "\nEspecialidade: " + this.getEspecialidade()
            + "\nSalario: " + this.getSalario()
            + "\nMédia salario anual: " + this.Calculo();
            
    }

    @Override
    public double Calculo() {
        return this.getSalario() * 12;
    }

    public static void printChef(
        ArrayList<Chef> chefs
    ) {
        try {
            for (Chef chef : chefs) {
                System.out.println(chef);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Chef getChef() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe ID do Chef para exclusão: \n");
            int id = scanner.nextInt();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chef WHERE id = " + id);

            if(!rs.next()) {
                throw new Exception("Id invalido");
            }
            scanner.close();
            return new Chef(
                rs.getInt("id_chef"),
                rs.getString("nome"), 
                rs.getString("cpf"), 
                rs.getString("data_nasc"), 
                rs.getString("especialidade"), 
                rs.getDouble("salario")
            );
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }    
    }    
    
    public static ArrayList<Chef> getChefs() throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chef;");
            ArrayList<Chef> chefs = new ArrayList<>();
            while (rs.next()) {
                chefs.add(
                    new Chef(
                        rs.getInt("id_chef"),
                        rs.getString("nome"), 
                        rs.getString("cpf"), 
                        rs.getString("data_nasc"), 
                        rs.getString("especialidade"), 
                        rs.getDouble("salario")
                    )
                );
            }
            con.close();
            return chefs;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    
    public static Chef getChefInsert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do Chef: \n");
        int id = scanner.nextInt();
        System.out.println("Informe o nome do Chef: \n");
        String nome = scanner.next();
        System.out.println("Informe o CPF do Chef: \n");
        String cpf = scanner.next();
        System.out.println("Informe a data de nascimento do Chef? \n");
        String dataDeNascimento = scanner.next();
        System.out.println("Informe a especialidade do Chef: \n");
        String especialidade = scanner.next();
        System.out.println("Informe o Salario do Chef: \n");
        double salario = scanner.nextFloat();
        scanner.close();

        return new Chef(
            id,
            nome,
            cpf,
            dataDeNascimento,
            especialidade,
            salario);
    }        

        
    public static void insertChef(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.executeQuery("INSERT INTO chef"
                + "(nome, cpf, data_nasc, especialidade, salario) VALUES "
                + "('"+chef.getNome()+"', '"+chef.getCpf()+"', '"+chef.getDataDeNascimento()+"', '"+chef.getEspecialidade()+"', '"+chef.getSalario()+"')") != null;
            if(!sql) {
                System.out.println("Falha!");
            }
            con.close();
            System.out.println("Registro Salvo!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Chef getChefUpdate() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            Chef chef = Chef.getChef();
            System.out.println("Informe o nome do Chef (Deixar em branco para manter \n)");
            String nome = scanner.next();
            if (nome.length() > 0){
                chef.setNome(nome);
            }        
            System.out.println("Informe o CPF do Chef (Deixar em branco para manter \n)");
            String cpf = scanner.next();
            if (cpf.length() > 0l){
                chef.setCpf(cpf);
            }        
            System.out.println("Informe a data de nascimento do Chef (Deixar em branco para manter \n)");
            String dataDeNascimento = scanner.next();
            if (dataDeNascimento.length() > 0){
                chef.setDataDeNascimento(dataDeNascimento);
            }        
            System.out.println("Informe a especialidade do Chef (Deixar em branco para manter \n)");
            String especialidade = scanner.next();
            if (especialidade.length() > 0){
                chef.setEspecialidade(especialidade);
            }        
            System.out.println("Informe o salario do Chef (Deixar em branco para manter \n)");
            double salario = scanner.nextFloat();
            if (salario == 0){
                chef.setSalario(salario);
            }        
            scanner.close();
            return chef;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } 
    }

    public static void updateChef(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("UPDATE chef SET "
                + " nome = '" + chef.getNome() + "'"
                + ", cpf = '" + chef.getCpf() + "'"
                + ", data_nasc = '" + chef.getDataDeNascimento() + "'"
                + ", especialidade = '" + chef.getEspecialidade() + "'"
                + ", salario = '" + chef.getSalario() + "'"
                + " WHERE id = " + chef.getId());
            if(!sql) {
                System.out.println("Falhou!");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteChef(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("DELETE FROM chef"
                + "WHERE id = " + chef.getId());
            if(!sql) {
                System.out.println("Falhou!");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
