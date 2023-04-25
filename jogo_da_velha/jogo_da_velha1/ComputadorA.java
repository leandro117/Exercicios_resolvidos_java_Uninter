import java.util.Random;

/**
 * Computador
 */
public class ComputadorA extends Computador {

    //atributos do computador
    
    public void setJogadaComputador() {
        Random aleatorio = new Random();
        int jogada = aleatorio.nextInt(9);
        this.pos = Integer.toString(jogada);
    }

}