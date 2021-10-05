import java.io.IOException;

public class SelectionSort {

    public static void main(String[] args) throws IOException {

        int quantidade = 10; // quantidade de número a serem ordenados
        int[] vetor = new int[quantidade]; //instancia a quantidade em um array
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade); // um for para deixar a quantidade randomica mesmo com números repetidos
        }

        long tempoInicial = System.currentTimeMillis(); // inicia o tempo de ordenação

        selectionSort(vetor); // chama o metodo selectionSort para realizar a ordenação

        long tempoFinal = System.currentTimeMillis(); // fecha o tempo de ordenação
 
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms"); // imprime o tempo de ordenação

    }

    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) { // percorre o array e guarda o valor em um local fixo
            int menor = fixo; // guarda o valor menor em um local fico do array

            for (int i = menor + 1; i < array.length; i++) { // pega o valor menor e passa ele para um sub array
                if (array[i] < array[menor]) { 
                    menor = i; // guarda o valor menor no sub array
                }
                System.out.println(array[menor] + ": Efetuando ordenação");  // imprime a ordenação do array
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor]; // guarda o valor fixo no subarray menor
                array[menor] = t; // pasa o subarray menor para um array fixo
                System.out.println(array[fixo] + ": Array ordenado"); // imprime o array ordenado
            }
        }
    }

}
