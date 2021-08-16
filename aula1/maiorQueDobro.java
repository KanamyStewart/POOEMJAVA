public class maiorQueDobro {
    public static String Resultado (int valor1, int valor2){
        return (valor1*2 == valor2 || valor2*2 == valor1)
        ? "O resultado é maior que o dobro do outro número"
        : "O resultado é menor que o dobro do outro número";
    }

    public static void main(String[] args) {
        System.out.println(Resultado(70,64));
    }
}
