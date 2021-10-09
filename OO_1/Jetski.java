public class Jetski {
    int capacidadeVeiculo;
    double comprimento;
    double largura;
    double pesoSeco;
    double capacidadeCombustivel;
    String cascoMaterial;
    String tipoDoMotor;
    String gasolinaRecomendada ;
    int potencia;
    int cilindrada;
    boolean profundimetro;
    boolean assentoErgolock;
    boolean assentoBiPartido;
    boolean controleDePartida;
    boolean chaveCodificada;
    boolean compartimentoParaCelulares;
    boolean sistemaDeAudio;
    boolean espelhoRetrovisores;
    boolean portaUsb;
    boolean displayDigital;
    boolean colunaDeDirecaoAjustavel;



    public Jetski(
        int capacidadeVeiculo,
        double comprimento,
        double largura,
        double pesoSeco,
        double capacidadeCombustivel,
        String cascoMaterial,
        String tipoDoMotor,
        String gasolinaRecomendada,
        int potencia,
        int cilindrada
    ){
        this.capacidadeVeiculo = capacidadeVeiculo;
        this.comprimento =  comprimento;
        this.largura = largura;
        this.pesoSeco = pesoSeco;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.cascoMaterial = cascoMaterial;
        this.tipoDoMotor = tipoDoMotor;
        this.gasolinaRecomendada = gasolinaRecomendada;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }
}
