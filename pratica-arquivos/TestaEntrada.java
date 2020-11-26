package davi.auka01;

/* @author Davi Teixeira */

import java.io.*;

public class aula01 {
    public static void main(String[] args) throws IOException{
        // FileInputStream permite a gente fazer um fluxo de estrada usando um arquivo
        InputStream is = new FileInputStream("arquivo.txt");
        /*byte por byte*/
        //char c = (char)isr.read();
        //System.out.println(c);

        //O construtor de InputStreamReaderpode receber o encoding a ser utilizado como parâmetro, 
        //se desejado, tal como UTF-8 ou ISO-8859-1.
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");

        //Guarda no buffer para ler uma linha inteira
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();
        
        System.out.println(s);
        
        s = br.readLine();
        System.out.println(s);

        // Laço para ler um arquivo inteiro.
        while(s != null) {
            System.out.println(s);
            s = br.readLine();
        }
        
        br.close();
    }
}