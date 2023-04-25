/**
 * Computador
 */
public class ComputadorB extends Computador {

    //atributos do computador
    int cont = 0;
    
    public void setJogadaComputador() {
        cont += 1;
        this.pos = Integer.toString(cont);
    }

}