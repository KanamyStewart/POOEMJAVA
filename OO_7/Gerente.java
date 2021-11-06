public class Gerente extends Pessoa{
    private String cargo;

    protected Gerente(
        String nome, 
        String cpf, 
        String dataNascimento,
        String cargo
        ) {
        super(nome, cpf, dataNascimento);
        this.cargo = cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }
    
}
