package gravaobj;

import java.io.Serializable;
import java.util.EnumSet;

/**
 * Bairro
 */
public class Bairro implements Serializable{

    public static final long serialVersionUID = 5110549514946052395L;

    String nome;
    boolean temRio;

    public static enum Qualidade {COMERCIAL, PRAIA, TURISMO, RESIDENCIAL};
    EnumSet<Qualidade> qualidades = EnumSet.noneOf(Qualidade.class);

    public Bairro(String nome, boolean temRio, EnumSet<Qualidade> qualidades) {
        this.nome = nome;
        this.temRio = temRio;
        this.qualidades = qualidades;
    }
}