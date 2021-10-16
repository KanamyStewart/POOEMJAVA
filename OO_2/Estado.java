public class Estado {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Joinville", "Sul", "Maconheiros", "Verde", "Cidade Urbada, com um monte de noia", (double) 35800);

        cidade.adicionarPessoa("Joaozinho", "12345678901", "27/08/1995");
        Pessoa pessoa = new Pessoa("Joãozinho", "12345678901", "27/08/1995");
    }
}
