package FIS;

import java.io.*;

public class testeEscrita {

    public static void main(String[] args) throws IOException {

        //Criando o fluxo de saida para arquivo
        FileOutputStream fos = new FileOutputStream("./resourses/lorem2.txt");

        //Melhorando os dados de binario para chars
        Writer osw = new OutputStreamWriter(fos);

        //Agrupando characteres para escrever de maneira de mais alto nivel
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("lorem impsum dolor");
        bw.newLine();
        bw.newLine();
        bw.write("aushuahsuhuasuhasuhaushasahsua auhsuahsuahus");

        bw.close();
    }
}
