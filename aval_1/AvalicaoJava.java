import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AvalicaoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner para ler o nome do arquivo
        
        System.out.println("Informe o nome do arquivo que deseja ordenar: ");
        String arquivo = scanner.nextLine(); // faz a leita do arquivo que o usuario informa
        
        ArrayList<Integer> dadosEmArray = new ArrayList<Integer>();
        try {
            FileReader dadosArquivo = new FileReader(arquivo); // abre os dados do arquivo
            BufferedReader lerDados = new BufferedReader(dadosArquivo); // cria um buffer temporario para leitura do arquivo

            String dadosDoArquivo = "";
            while (dadosDoArquivo != null){ // a variável dadosDoArquivo recebe null quando atingir o final do arquivo
                dadosDoArquivo = lerDados.readLine(); // faz leitura da primeira linha do arquivo
                System.out.printf("%s\n", dadosDoArquivo);

                dadosEmArray.add(Integer.parseInt(dadosDoArquivo));
            }

        SelectionSort ordenarDados = new SelectionSort();
        int arr[] = dadosEmArray;
        ordenarDados.sort(arr);
        System.out.println("Array ordenado: ");
        ordenarDados.imprimirArray(arr);

            dadosArquivo.close();
        } catch (IOException e) {
            System.out.printf("Erro ao abrir arquivo, verifique o nome do arquivo informado e tente novamente!",
            e.getMessage());
        }
    }

// implementação do modelo de selection sort (esse método faz uma matriz encontrando o valor mínimo
// repetidamente considerando onder crescente da parte ainda não classíficada, e coloca o valor no início, após a primeira ordenação)
    public class  SelectionSort {
        void sort(int arr[]) {
            int num = arr.length; // variavel do tamanho do array
// procura o valor minimo em um array sortido            
            for (int i = 0; i < num-1; i++){ 
                int indexMin = i; 
                for (int j = i+1; j < num; j++) 
                    if (arr[j] < arr[indexMin]) 
                        indexMin = j; 
// troca o valor minimo encontrado pelo valor atual 
            int ordenar = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = ordenar;
            }
        }
        public void imprimirArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.printf(arr[i]+ "\n");
        }
    }
    
}
