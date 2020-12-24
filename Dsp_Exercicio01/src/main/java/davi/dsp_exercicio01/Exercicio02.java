
package davi.dsp_exercicio01;

/* @author Davi Teixeira */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio02{

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
	String originFileName = "", destinyFileName = "";
		
	System.out.println("Digite o nome do arquivo origem");
	originFileName = scanner.next();
		
	long initialTime = System.currentTimeMillis();
			
	FileInputStream file = null;
	
        file = new FileInputStream(originFileName);
				 
		
			
	InputStreamReader input = new InputStreamReader(file);
	BufferedReader br = new BufferedReader(input);
	        
	System.out.println("Digite o nome do arquivo destino");
	destinyFileName = scanner.next();
	        
	FileWriter fw = new FileWriter(destinyFileName, true);
        PrintWriter pw = new PrintWriter(fw);
        String word = "";
        while((word = br.readLine()) != null) 
            pw.println(word);
        System.out.println("Tempo total de cópia: " + (System.currentTimeMillis() - initialTime) + " ms");
            
            
        file.close();
        input.close();
        br.close();
        fw.close();
        pw.close();
    }
}
