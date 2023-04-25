package arquivo_existe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Arquivo_Existe
 */
public class Arquivo_Existe {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        while (true) {

         String nome = ler.next();

         File objFile = new File(nome);

         if (objFile.exists()) {
             if (objFile.isFile()) {
                System.out.println("Arquivo" + objFile.getName() + "existe - tamanho: " + objFile.length() + "bytes");
                System.out.println("Conteudo do arquivo: ");
                FileReader arq = new FileReader(nome);
                BufferedReader lerArq = new BufferedReader(arq);

                String linha = lerArq.readLine(); //le a primeira linha
                while(lerArq.readLine() != null){
                    System.out.println(linha);
                    linha = lerArq.readLine(); //ler a segunda linha
                }
                lerArq.close();
                break;

            }
             else if (objFile.isDirectory()){
                System.out.println("Conteudo do diretório: ");
                String diretorio[] = objFile.list();
                for (String item : diretorio) {
                    System.out.println(item);
                }
                break;
            }
         }
         else {
            System.out.println("Erro: Arquivo ou diretório informado não existe!");
            continue;
         }
        }

        ler.close();
    }
}