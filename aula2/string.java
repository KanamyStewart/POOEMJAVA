import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Digite uma frase:");
        entrada = scanner.next();

            for(char c: entrada.toCharArray()) {
                System.out.println("Char: "+c);
        }
    }
}