import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dtNascimento;
    ArrayList<Paciente> paciente = new ArrayList<>();
    ArrayList<Medico> medico = new ArrayList<>();

    private void setNome(String nome){
        this.nome = nome;
    }

    private void setCpf(String cpf){
        this.cpf = cpf;
    }

    private void setDtNascimento(String dtNascimento){
        this.dtNascimento = dtNascimento;
    }

    private String getNome(){
        return this.nome;
    }

    private String getCpf(){
        return this.cpf;
    }

    private String getDtNascimento(){
        return this.dtNascimento;
    }
}