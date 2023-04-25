import java.io.IOException;

/**
 * JogoDaVelha
 */
public class JogoDaVelha {

    public static void main(String[] args) throws IOException, InterruptedException {

        int jogadas = 0;

        Tabuleiro jogo = new Tabuleiro();
        
        jogo.menu();
        while (true) {
            jogo.posVez();
            jogo.trocaVez();
            jogo.validaJogada();
            jogo.atualizaMenu();
            jogadas += 1;
            
            if (jogo.resultado() == false) {
                if (jogo.vez == "X") {
                    System.out.println("Vitória do Jogador!");
                }
                else if (jogo.vez == "O"){
                    System.out.println("Vitória do Computador!");
                }
                break;
            }
            else if(jogadas == 9) {
                System.out.println("Deu velha !");
                break;
            }
        }

    }
}