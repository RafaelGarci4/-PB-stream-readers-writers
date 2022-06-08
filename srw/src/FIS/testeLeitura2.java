package FIS;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class testeLeitura2 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("./resourses/contas.csv"));

        while ( scanner.hasNextLine()){

            String linha = scanner.nextLine();

            // System.out.println(linha);
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String tipoDeConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

          String valorFormatado =  String.format(new Locale("pt","BR"),
                                                "%s | %04d-%08d | %s | %.2f",
                                                tipoDeConta, agencia,numero,titular,saldo);

            System.out.println(valorFormatado);
            // String[] valores = linha.split(",");
           // System.out.println(valores[3]);
            linhaScanner.close();
        }

        scanner.close();

    }

}
