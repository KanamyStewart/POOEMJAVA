import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class imc {
    public static void main(String[] args) {
        System.out.println("IMC gravando em arquivo de texto");
        String[] infoPerson = new String[5];

        try {
            BufferedReader buffer = new BufferedReader(
                new FileReader("./person.txt")
            );
            String temp = "";
            int cont = 0;
            while((temp = buffer.readLine()) != null) {
                infoPerson[cont] = temp;
                cont++;
            }
            buffer.close();

            double altura = Double.parseDouble(infoPerson[2]);
            double peso = Double.parseDouble(infoPerson[3]);
            double imc = peso / (altura * altura);
            String imcCalc = "";
            if(imc <= 18.5) { 
                imcCalc = "Abaixo do Peso";
            } else if (imc > 18.6 && imc <= 24.9) { 
                imcCalc = "Peso Ideal";
            } else if (imc > 25.0 && imc <= 29.9) { 
                imcCalc = "Levemente acima do peso";
            } else if (imc > 30.0 && imc <= 34.9) { 
                imcCalc = "Obesidade Grau I";
            } else if (imc > 35.0 && imc <= 39.9) { 
                imcCalc = "Obesidade Grau II";
            } else if (imc > 40) { 
                imcCalc = "Obesidade Grau III (mórbida)";
            } else {
                imcCalc = "Valores inválidos";
            }

            BufferedWriter bufferW = new BufferedWriter(
                new FileWriter("file")
            );

            bufferW.append("O nome é " 
                + infoPerson[0]
                + ", tendo idade de "
                + infoPerson[1]
                + ", altura "
                + infoPerson[2]
                + ", peso "
                + infoPerson[3]
                + ", imc "
                + imcCalc
                + " e email "
                + infoPerson[4]);
            bufferW.close();


        } catch (IOException e) {

        }
    }
}