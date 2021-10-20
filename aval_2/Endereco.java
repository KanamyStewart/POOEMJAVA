public class Endereco {
    int id;
    int numero;
    String cep;
    String rua;
    String bairro;
    String cidade;

    public Endereco(
        int id,
        int numero,
        String cep,
        String rua,
        String bairro,
        String cidade
    ){
        this.id = id;
        this.numero = numero;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }
}
