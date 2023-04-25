package lerdadospessoa;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * LerDadosPessoa
 */
public class LerDadosPessoa {

    public static void main(String[] args) throws IOException {
        String nome;
        char sexo;
        int idade;
        int altura;
        double peso; //peso corporal
        double geb = 0; //gasto energetico basal

        FileInputStream arq = new FileInputStream("//home//leandro//Downloads//arquivo.dat");
        DataInputStream lerArq = new DataInputStream(arq);

        nome = lerArq.readUTF();
        sexo = lerArq.readChar();
        idade = lerArq.readInt();
        altura = lerArq.readInt();
        peso = lerArq.readDouble();

        if (sexo == 'M' || sexo == 'm') {
            geb = 66.47 + (13.75 * peso) + (5 * altura) - (6.76 * idade);
        }
        else if (sexo == 'F' || sexo == 'f') {
            geb = 655.1 + (9.56 * peso) + (1.85 * altura) - (4.67 * idade);
        }
        else {
            System.out.println("Erro! Digite [m] se masculino Ou [f] se feminino");
        }

        System.out.println("Nome------------------: " + nome);
        System.out.println("Sexo------------------: " + sexo);
        System.out.println("Idade-----------------: " + idade + "anos");
        System.out.println("Peso Corporal---------: " + peso + "kgs");
        System.out.println("Altura----------------: " + altura + "cm");
        System.out.println("Gasto Energetico Basal: " + geb + "kcal/dia");

        arq.close();
    }
}