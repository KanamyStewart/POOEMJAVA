public class Investimento extends Conta {

    protected Investimento(
        String nome, 
        String cpf, 
        String dataNascimento, 
        String dataInicio, 
        String historico,
        String agencia, 
        int numeroConta, 
        double saldo, 
        double entradaValor, 
        double saidaValor
        ) {
        super(nome, 
        cpf, 
        dataNascimento, 
        dataInicio, 
        historico, 
        agencia, 
        numeroConta, 
        saldo, 
        entradaValor, 
        saidaValor);
    }
    
}
