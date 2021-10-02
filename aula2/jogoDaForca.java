import java.util.Scanner; 
  
public class jogoDaForca {

	static String palavra[] = {"c","h","a","v","e"};

    public static void main ( String args [] ) {
	
	Scanner scanner = new Scanner(System.in);
		
	int forca = 1, vencer = 0, perder = 0, contador = 0;
	String letra, letrasDigitadas[] = new String [100];
	
	while (forca == 1) {
        System.out.println("Orientações! Você tem 5 chances, lembre-se digite penas uma letra por ver!");
        System.out.println("Dica: Abre corações e portas!");
		System.out.println("Digite a letra:");
		letra = scanner.next();
		letrasDigitadas[contador] = letra;
		contador++;
		if (!letra.equals("c") && !letra.equals("h") && !letra.equals("a") && !letra.equals("v") && !letra.equals("e")) {
			System.out.println("Letra incorreta.");
			perder++;
			if (perder == 5) {
				System.out.println("Voce perdeu."); System.exit(0);
			}
		} else {
			System.out.println("Letra correta.");
			vencer++;
			if (vencer == 5) {
				System.out.println("Voce venceu."); System.exit(0);
			} 
			}
	}
	
	}
}