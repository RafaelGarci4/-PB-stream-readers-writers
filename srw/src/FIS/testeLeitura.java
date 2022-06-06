package FIS;

import java.io.*;

public class testeLeitura {

    public static void main(String[] args) throws IOException {

        //Criando o fluxo de entrada com arquivo
        FileInputStream fis = new FileInputStream("./resourses/lorem.txt");

        //Melhorando os dados de binario para chars
        InputStreamReader isr = new InputStreamReader(fis);

        //Agrupando characteres para ler de maneira de mais alto nivel
        BufferedReader br = new BufferedReader(isr);

        // le a linha
        String linha = br.readLine();

        System.out.println(linha);

        br.close();
    }

}
