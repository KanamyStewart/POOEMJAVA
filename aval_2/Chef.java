import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Chef extends Pessoa implements CalculoSalario{
    private String especialidae;
    private String salario;
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
        String salario
        ) {
        super(nome, cpf, dataDeNascimento);
        this.id = id;
        this.especialidae = especialidade;
        this.salario = salario;
    }
    protected Chef(
        String nome, 
        String cpf, 
        String dataDeNascimento,
        String especialidade,
        String salario
        ) {
        super(nome, cpf, dataDeNascimento);
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

    public String getSalario(){
        return this.salario;
    }

    public void setSalario(String salario){
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
        return "Nome Chef: " + this.getNome() 
            + "CPF: " + this.getCpf() 
            + "Data Nascimento: " + this.getDataDeNascimento()
            + "Especialidade: " + this.getEspecialidade()
            + "Salario: " + this.getSalario()
            + "Média salario anual: " + this.Calculo();
            
    }

    @Override
    public String toString() {
        return "{" +
            " id do chefe: '" + getId() + "'" +
            ", Nome: '" + getNome() + "'" +
            ", CPF: '" + getCpf() + "'" +
            ", Data de Nascimento: '" + getDataDeNascimento() + "'" +
            ", Especialidade: '" + getEspecialidade() + "'" +
            ", Salario: '" + getSalario() + "'" +
            "}";
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

    public static Chef getChef(Scanner scanner) throws Exception {
        try {
            System.out.println("Informe ID do Chef: ");
            int id = scanner.nextInt();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chef WHERE id = " + id);

            if(!rs.next()) {
                throw new Exception("Id invalido");
            }
            return new Chef(
                rs.getInt("id"),
                rs.getString("nome"), 
                rs.getString("cpf"), 
                rs.getString("data_nasc"), 
                rs.getString("especialidade"), 
                rs.getString("salario")
            );
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }    
    }    
    
    public static ArrayList<Chef> getChefs() throws Exception{
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chef;");
            ArrayList<Chef> chefs = new ArrayList<>();
            while (rs.next()) {
                chefs.add(
                    new Chef(
                        rs.getInt("id"),
                        rs.getString("nome"), 
                        rs.getString("cpf"), 
                        rs.getString("data_nasc"), 
                        rs.getString("especialidade"), 
                        rs.getString("salario")
                    )
                );
            }
            con.close();
            return chefs;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    
    public static Chef getChefInsert(Scanner scanner) {
        System.out.println("Informe o nome do Chef: ");
        String nome = scanner.next();
        System.out.println("Informe o CPF do Chef: ");
        String cpf = scanner.next();
        System.out.println("Informe a data de nascimento do Chef: ");
        String dataDeNascimento = scanner.next();
        System.out.println("Informe a especialidade do Chef: ");
        String especialidade = scanner.next();
        System.out.println("Informe o Salario do Chef: ");
        String salario = scanner.next();
        

        return new Chef(
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
            stm.execute("INSERT INTO chef"
                + "(nome, cpf, data_nasc, especialidade, salario) VALUES "
                + "('"+chef.getNome()+"', '"+chef.getCpf()+"', '"+chef.getDataDeNascimento()+"', '"+chef.getEspecialidade()+"', '"+chef.getSalario()+"')");
            con.close();
            System.out.println("Registro Salvo!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Chef getChefUpdate(Scanner scanner) throws Exception {
        try {
            Chef chef = Chef.getChef(scanner);
            System.out.println("Informe o nome do Chef (Deixar em branco para manter)");
            String nome = scanner.next();
            if (nome.length() > 0){
                chef.setNome(nome);
            }        
            System.out.println("Informe o CPF do Chef (Deixar em branco para manter)");
            String cpf = scanner.next();
            if (cpf.length() > 0l){
                chef.setCpf(cpf);
            }        
            System.out.println("Informe a data de nascimento do Chef (Deixar em branco para manter)");
            String dataDeNascimento = scanner.next();
            if (dataDeNascimento.length() > 0){
                chef.setDataDeNascimento(dataDeNascimento);
            }        
            System.out.println("Informe a especialidade do Chef (Deixar em branco para manter)");
            String especialidade = scanner.next();
            if (especialidade.length() > 0){
                chef.setEspecialidade(especialidade);
            }        
            System.out.println("Informe o salario do Chef (Deixar em branco para manter)");
            String salario = scanner.next();
            if (especialidade.length() > 0){
                chef.setSalario(salario);
            }        
            
            return chef;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } 
    }

    public static void updateChef(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("UPDATE chef SET "
                + " nome = '" + chef.getNome() + "'"
                + ", cpf = '" + chef.getCpf() + "'"
                + ", data_nasc = '" + chef.getDataDeNascimento() + "'"
                + ", especialidade = '" + chef.getEspecialidade() + "'"
                + ", salario = '" + chef.getSalario() + "'"
                + " WHERE id = " + chef.getId());
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteChef(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            stm.execute("DELETE FROM chef WHERE id = " + chef.getId());
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public double Calculo() {
        
        return 0;
    }
}
