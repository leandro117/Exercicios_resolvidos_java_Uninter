package gravatabuada;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * GravaTabuada
 */
public class GravaTabuada {

    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);

        int i;
        int n;
        
        System.out.println("Informe um número para a tabuada: ");
        n = ler.nextInt();

        FileWriter arq = new FileWriter("//home//leandro//Downloads//tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.println("+--Resultado--+");
        for(i = 1; i <= 10; i++) {
            gravarArq.println(n + " x " + i + " = " + n*i);
        }

        gravarArq.println("+-------------+");

        System.out.println("Tabuada do " + n + " foi gravada com sucesso em //home//leandro//Downloads//tabuada.txt" );

        ler.close();
        arq.close();

    }
}