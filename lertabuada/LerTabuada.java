package lertabuada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * LerTabuada
 */
public class LerTabuada {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Conteúdo do arquivo texto: ");
        String nome = ler.next(); 

        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); //le a primeira linha
            while(lerArq.readLine() != null){
                System.out.println(linha);
                linha = lerArq.readLine(); //ler a segunda linha
            }
            lerArq.close();
            ler.close();
            
        } catch (IOException e) {
            System.out.println("Erro na abertura do arquivo:" + e.getMessage());
        }
        System.out.println("");
    }
}