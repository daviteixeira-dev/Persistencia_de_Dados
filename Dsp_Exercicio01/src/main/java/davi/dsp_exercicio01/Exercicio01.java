package davi.dsp_exercicio01;

/* @author Davi Teixeira */

/*Lista de Exercícios 01

    1. Crie uma aplicação para receber via entrada de teclado um nome de arquivo texto e dois números inteiros (n1 e n2).
    A aplicação deve exibir as linhas do arquivo entre n1 e n2, incluindo as linhas n1 e n2. Se n1 não for definido,
    deve-se exibir as linhas do arquivo a partir da primeira linha até n2. Se n2 não for definido, deve-se exibir as
    linhas do arquivo a partir de n1 até o final do arquivo.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        
        System.out.println("A aplicação deve exibir as linhas do arquivo entre n1 e n2, incluindo as linhas n1 e n2.");
        System.out.println("Digite os valores de n1 e n2 abaixo:");
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        
        System.out.println("Qual o nome do arquivo? Escreva com o termino '.txt' ");
	String Arquivo = ler.next();
        
        FileInputStream doc = new FileInputStream(Arquivo);
        InputStreamReader isr = new InputStreamReader(doc, "UTF-8");
	BufferedReader buffer = new BufferedReader(isr);
        String line = "";
        
        if(n1 < 0 || n2 < 0){ 
            System.out.println("Por favor, insira valores positivos.");
            
        }else if(n1 != 0 && n2 != 0){
            for(int i = 0; i < n1; i++)
                line = buffer.readLine();
            System.out.println(line);
	        
            for(int i = n1; i < n2; i++){ 
                line = buffer.readLine();
                System.out.println(line);
            }
        }else if(n1 == 0 && n2 != 0){
            for(int i = 0; i < n2; i++){
                line = buffer.readLine();
                System.out.println(line);
            }      		
	}else if(n1 != 0 && n2 == 0){
            for(int i = 0; i < n1; i++)
	        line = buffer.readLine();
            System.out.println(line);
            while((line = buffer.readLine()) != null)
	        System.out.println(line);
        }else{
            while((line = buffer.readLine()) != null)
	        System.out.println(line);
        }
        
        // Fechar arquivo.
	doc.close();
    }
}