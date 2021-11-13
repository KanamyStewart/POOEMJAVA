
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String dataDeNascimento;

    protected Pessoa(
        String nome,
        String cpf,
        String dataDeNascimento
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    protected String getNome() {
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

    protected String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    protected void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public abstract String carteira();

}