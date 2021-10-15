import javax.xml.crypto.Data;

public class Pessoa {
    String nome;
    String cpf;
    Data data;

    public Pessoa(
        String nome,
        String cpf,
        Data data
    ){
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
    }
}