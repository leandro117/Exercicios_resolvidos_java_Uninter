/**
 * Computador
 */
public class ComputadorC extends Computador {

    //atributos do computador
    int cont = 10;
    
    public void setJogadaComputador() {
    
        cont -= 1;
        this.pos = Integer.toString(cont);
    }

}