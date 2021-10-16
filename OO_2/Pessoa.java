import javax.xml.crypto.Data;

public class Pessoa {
    String nome;
    String cpf;
    String data;
    Cidade cidade;

    public Pessoa(
        String nome,
        String cpf,
        String data
    ){
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
    }
}