import java.util.Scanner;

public class mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada =0;

        do{
            System.out.println(" Digite um numero de 1 a 12 e saiba qual mês ele representa, ou digite 0 para sair: ");
            entrada = scanner.nextInt();

        switch (entrada) {
            case 1:
                System.out.println(" Janeiro ");
                break;

            case 2:
                System.out.println(" Fevereiro ");
                break;

            case 3:
                System.out.println(" Março ");
                break;

            case 4:
                System.out.println(" Abril ");
                break;
            
            case 5:
                System.out.println(" Maio ");
                break;
        
            case 6:
                System.out.println(" Junho ");
                break;

            case 7:
                System.out.println(" Julho ");
                break;

            case 8:
                System.out.println(" Agosto ");
                break;

            case 9:
                System.out.println(" Setembro ");
                break;

            case 10:
                System.out.println(" Outubro ");
                break;

            case 11:
                System.out.println(" Novembro ");
                break;

            case 12:
                System.out.println(" Dezembro ");
                break;

            case 13:
                System.out.println(" O Valor digitado não corresponde a nenhum mês do ano! ");
                break;

            default:
            case 0:
                System.out.println(" Saindo! ");
                break;
        }
    }while (entrada != 0);
    }
}