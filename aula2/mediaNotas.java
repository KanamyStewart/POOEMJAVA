import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite o valor da sua 1° nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println(" Digite o valor da sua 2° nota: ");
        float nota2 = scanner.nextFloat();
        
        System.out.println(" Digite o valor da sua 3° nota: ");
        float nota3 = scanner.nextFloat();

        float media = nota1+nota2+nota3 / 3;

        if (media > 7){
            System.out.println(" Você foi aprovado! ");
        } else{
            System.out.println(" Você está reprovado! ");
        }
    }
}