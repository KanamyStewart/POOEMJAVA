public class parOuImpar {
    public static String Conferir(int valor1){
        return (valor1 % 2 == 0)
        ? "O número é Par"
        : "O número é Impar";
    }

    public static void main(String[] args) {
        System.out.println(Conferir(6));
    }
}