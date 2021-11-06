import java.util.ArrayList;

public class Conta extends Corrente{
    String agencia;
    int numeroConta;
    double entradaValor;
    double saidaValor;
    double saldo;
    private ArrayList<Corrente> correntes = new ArrayList<>();

    protected Conta(
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
        super(nome, cpf, dataNascimento, dataInicio, historico);
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.entradaValor = entradaValor;
        this.saidaValor = saidaValor;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setEntradaValor(double entradaValor) {
        this.entradaValor = entradaValor;
    }

    public void setSaidaValor(double saidaValor) {
        this.saidaValor = saidaValor;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getEntradaValor() {
        return this.entradaValor;
    }

    public double getSaidaValor() {
        return this.saidaValor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public ArrayList<Corrente> getCorrentes() {
        return this.correntes;
    }

}