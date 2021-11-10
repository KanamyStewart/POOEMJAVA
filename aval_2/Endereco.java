import java.util.ArrayList;

public class Endereco {
    private int id;
    private int numero;
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private ArrayList<Estabelecimentos> estabelecimentos = new ArrayList<>();

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

    public void setId(int id){
        this.id = id;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public int getId(){
        return this.id;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getCep(){
        return this.cep;
    }

    public String getRua(){
        return this.rua;
    }

    public String getBairro(){
        return this.bairro;
    }

    public String getCidade(){
        return this.cidade;
    }
    
    public void setEndeco(Estabelecimentos estabelecimentos){
        this.estabelecimentos.add(estabelecimentos);
    }

    public ArrayList<Estabelecimentos> getEstabelecimentos(){
        return this.estabelecimentos;
    }
}
