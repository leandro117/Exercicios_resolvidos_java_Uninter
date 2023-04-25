import java.io.IOException;
import java.util.Scanner;

/**
 * Tabuleiro
 */
public class Tabuleiro {

    String vez = Computador.getComputador();
    String pos = Computador.getComputador();
    int invalida = 0;
    int total = 0;
    boolean res;
    String v[][] = new String[3][3];
    int n = 0;
    int opcao;
    Computador computador;

    Scanner teclado = new Scanner(System.in);
    Jogador jogador = new Jogador();

    public Tabuleiro() {
        System.out.println("Em qual dificuldade deseja jogar ?");
        System.out.println("ComputadorA digite [1]");
        System.out.println("ComputadorB digite [2]");
        System.out.println("ComputadorC digite [3]");
        opcao = teclado.nextInt();

        if (opcao == 1) {
            this.computador = new ComputadorA();
        } 
        else if (opcao == 2){
            this.computador = new ComputadorB();
        }
        else if(opcao == 3) {
            this.computador = new ComputadorC();
        }
    }


    //método que mostra o menu
    public void menu() {

        System.out.println("+----+---+");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                n += 1;
                v[i][j] = "" + n;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + v[i][j]);
            }
            System.out.println("|");
            System.out.println("+---+----+");
        }
    }

    //método que atualiza o menu
    public void atualizaMenu() throws IOException, InterruptedException {
        
        //limpa a tela

        if (System.getProperty("os.name").contains("Windows")) {
         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
        }
        else {
         Runtime.getRuntime().exec("clear");  
        } 

        //imprime a tela atualizada
        System.out.println("+----+---+");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + v[i][j]);
            }
            System.out.println("|");
            System.out.println("+---+----+");
        }
        System.out.println("");
    }

    //método que troca a vez do jogador
    public void trocaVez() {
      if (vez == Jogador.getJogador()) {
        vez = Computador.getComputador();

      } 
      else {
        vez = Jogador.getJogador();
      } 
    }

    //método que troca a pos do jogador
    public void posVez() {
        if (pos == jogador.getJogadaJogador()) {
         computador.setJogadaComputador();
         pos = computador.getJogadaComputador();
        }
        else {
         jogador.setJogadaJogador();
         pos = jogador.getJogadaJogador();
        } 
    }

    //método que valida a jogada do jogador
    public void validaJogada() {
        while (true) {
         invalida = 0;
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (v[i][j].equals(pos)) {
                    v[i][j] = vez;
                    invalida += 1;
                }

                else if (!v[i][j].equals(pos) && v[i][j].equals("X") || v[i][j].equals("O")) {
                    invalida += 0;
                }
                
            }
         }

            if(invalida == 0) {
                if (vez == Jogador.getJogador()) {
                    System.out.println("jogada invalida Jogador, digite uma jogada valida: ");
                    jogador.setJogadaJogador();
                    pos = jogador.getJogadaJogador();
                }
                else {
                    computador.setJogadaComputador();
                    pos = computador.getJogadaComputador();
                }
            }
            else {
                break;
            }

        }

    }

    //método que retorna o resultado da partida
    public boolean resultado() {

        res = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             
             //linhas
             if (v[0][0].equals("X") && v[0][1].equals("X") && v[0][2].equals("X")
             || v[0][0].equals("O") && v[0][1].equals("O") && v[0][2].equals("O")) {
              res = false;  
             }

             else if (v[1][0].equals("X") && v[1][1].equals("X") && v[1][2].equals("X")
             || v[1][0].equals("O") && v[1][1].equals("O") && v[1][2].equals("O")) {
              res = false;
             }

             else if (v[2][0].equals("X") && v[2][1].equals("X") && v[2][2].equals("X")
             || v[2][0].equals("O") && v[2][1].equals("O") && v[2][2].equals("O")) {
              res = false;
             }

             //colunas
             else if (v[0][0].equals("X") && v[1][0].equals("X") && v[2][0].equals("X")
             || v[0][0].equals("O") && v[1][0].equals("O") && v[1][0].equals("O")) {
              res = false;
             }

             else if (v[0][1].equals("X") && v[1][1].equals("X") && v[2][1].equals("X")
             || v[0][1].equals("O") && v[1][1].equals("O") && v[2][1].equals("O")) {
              res = false;
             }

             else if (v[0][2].equals("X") && v[1][2].equals("X") && v[2][2].equals("X")
             || v[0][2].equals("O") && v[1][2].equals("O") && v[2][2].equals("O")) {
              res = false;
             }

             //diagonal esquerda
             else if (v[0][0].equals("X") && v[1][1].equals("X") && v[2][2].equals("X")
             || v[0][0].equals("O") && v[1][1].equals("O") && v[2][2].equals("O")) {
              res = false;
             }

             //diagonal direita
             else if (v[0][2].equals("X") && v[1][1].equals("X") && v[2][0].equals("X")
             || v[0][2].equals("O") && v[1][1].equals("O") && v[2][0].equals("O")) {
              res = false;
             }

            }

        }

        //velha
        
        return res;

    }

}