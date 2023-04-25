package salvadadospessoa;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;


/**
 * SalvaDadosPessoa
 */
public class SalvaDadosPessoa{

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner ler = new Scanner(System.in);

        String nome;
        char sexo;
        int idade;
        int altura;
        double peso;

        FileOutputStream arq = new FileOutputStream("//home//leandro//Downloads//arquivo.dat");
        DataOutputStream gravaArquivo = new DataOutputStream(arq);

        System.out.println("Informe o seu nome: ");
        nome = ler.next();

        System.out.println("Informe o seu sexo(m/f): ");
        sexo = (char) System.in.read();

        System.out.println("Informe o sua idade: ");
        idade = ler.nextInt();

        System.out.println("Informe o sua altura (em cm): ");
        altura = ler.nextInt();

        System.out.println("Informe o seu peso(em kg): ");
        peso = ler.nextDouble();

        gravaArquivo.writeUTF(nome);
        gravaArquivo.writeChar(sexo);
        gravaArquivo.writeInt(idade);
        gravaArquivo.writeInt(altura);
        gravaArquivo.writeDouble(peso);

        arq.close();
        ler.close();

        System.out.println("Dados gravados com sucesso em " + "//home//leandro//Downloads//arquivo.dat");

    }
}