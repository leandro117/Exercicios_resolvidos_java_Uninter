import java.util.Scanner;

/**
 * Jogador
 */
public class Jogador {

    Scanner teclado = new Scanner(System.in);

    //atributos do jogador
    private static String jogador = "X";
    private String pos;


    //metodos acessores
    public String getJogadaJogador() {
        return this.pos;
    }
    public void setJogadaJogador() {
        System.out.println("Digite sua jogada Jogador: ");
        this.pos = teclado.next();
    }

    public static String getJogador() {
        return jogador;
    }

}