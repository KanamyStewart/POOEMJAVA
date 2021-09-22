import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("tabuada.txt"));
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o valor da tabuada");
            int valor = in.nextInt();
            for (int cont = 0; cont <= 10; cont++){
                file.append(cont + " x " + valor + " = " + (cont*valor) + "\n");
            }
            in.close();
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
