package davi.dsp_exercicio02;

/* @author Davi Teixeira */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class Questao01{
    public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
	String origem, destino;
		
	System.out.println("Arquivo origem: ");
	origem = scan.next();
	File arquivo = new File(origem); 
		
	long tempo = System.currentTimeMillis();
	byte[] tamanho = Files.readAllBytes(arquivo.toPath());
	String textOrigin = new String(tamanho, "UTF-8");
		
	System.out.println("Arquivo destino: ");
	destino = scan.next();
	PrintWriter print = new PrintWriter(destino);
	print.print(textOrigin);
		
	System.out.println("Tempo total: " + (System.currentTimeMillis() - tempo));
	print.close();	
    }
}