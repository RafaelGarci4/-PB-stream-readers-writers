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

        // le a linha ate acabar
        while(linha != null){

            System.out.println(linha);
            linha = br.readLine();
        }
        //mostra linha

        br.close();

    }

}
