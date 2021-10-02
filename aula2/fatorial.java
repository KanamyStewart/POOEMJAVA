import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número para verificar seu fatorial:");
        numero = scanner.nextInt();

        System.out.println("O fatorial de " + numero + " é " + fatorial(numero));
    }

    public static int fatorial(int numero){
        int fatorial = 1;
        for(int i=1; i<=numero; i++){
            fatorial *=i;
        }
        return fatorial;
    }
}
