package FIS;

import java.io.*;

public class testeCopiarArquivo {

    public static void main(String[] args) throws IOException {

        //Criando o fluxo de entrada com arquivo
        FileInputStream fis = new FileInputStream("./resourses/lorem.txt");
        //Melhorando os dados de binario para chars
        InputStreamReader isr = new InputStreamReader(fis);
        //Agrupando characteres para ler de maneira de mais alto nivel
        BufferedReader br = new BufferedReader(isr);

        //Criando o fluxo de saida para arquivo
        OutputStream fos = System.out;
        //Melhorando os dados de binario para chars
        Writer osw = new OutputStreamWriter(fos);
        //Agrupando characteres para escrever de maneira de mais alto nivel
        BufferedWriter bw = new BufferedWriter(osw);

        // le a linha
        String linha = br.readLine();

        // le a linha ate acabar
        while(linha != null && linha.isEmpty()){

            //Escreve a linha no arquivo
            bw.write(linha);
            //quebra a linha
            bw.newLine();
            //descarrega o buffer
            bw.flush();
            //le a proxima linha e testa a condicao do while
            linha = br.readLine();

        }


        br.close();
        bw.close();


    }
}
