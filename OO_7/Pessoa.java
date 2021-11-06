import java.util.ArrayList;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private ArrayList<Correntista> correntistas = new ArrayList<>();

    protected Pessoa(
        String nome,
        String cpf,
        String dataNascimento        
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    protected String getNome(){
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return this.cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getDataNascimento() {
        return this.dataNascimento;
    }

    protected void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Correntista> getCorrentistas() {
        return this.correntistas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    public String carteira() {
        return "Nome" + this.getNome()
        + "\n CPF: " + this.getCpf()
        + "\n DATA NASC: " + this.getDataNascimento();
    }
}
