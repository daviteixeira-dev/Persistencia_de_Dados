package davi.auka01;

/* @author Davi Teixeira */

import java.io.*;

// Lendo o arquivo inteiro usando scanner

public class aula01 {
    public static void main(String[] args) throws IOException{
        InputStreamis = new FileInputStream("arquivo.txt");
        Scanner entrada = new Scanner(is);
        
        while(entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        
        is.close();
    }
}