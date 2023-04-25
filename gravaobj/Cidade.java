package gravaobj;

import java.util.List;
import java.io.Serializable;

/**
 * Cidade
 */
public class Cidade implements Serializable{

    public static final long serialVersionUID = -7932047122858971692L;

    static class Ponto implements Serializable {

        private static final long serialVersionUID = 2651887979907L;

        double x, y;

        public Ponto(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    String nome;
    Ponto cordenadas;
    int populacao;
    boolean cidadePortuaria;
    List<String> palavras_chaves;

    Bairro[] bairros;

    public Cidade(String nome, double geox, double geoy, int populacao, boolean cidadePortuaria, List<String> palavras, Bairro[] bairros){
        this.nome = nome;
        this.cordenadas = new Ponto(geox, geoy);
        this.populacao = populacao;
        this.cidadePortuaria = cidadePortuaria;
        this.palavras_chaves = palavras;
        this.bairros = bairros;

    }

    @Override
    public String toString(){
        StringBuilder strUtil = new StringBuilder();

        strUtil.append("Cidade: " + this.nome + "\n");
        strUtil.append("\n\tCordenadas: " + this.cordenadas.x + "," + this.cordenadas.y);
        strUtil.append("\n\tPopulação: " + this.populacao);
        strUtil.append("\n\tCidade Portuária: " + (this.cidadePortuaria ? "sim" : "não"));
        strUtil.append("\n\tPalavras-Chaves: " + this.palavras_chaves);

        strUtil.append("\n\tBairros");
        for(Bairro bairro: this.bairros){
            strUtil.append("\n\tNome do Bairro: " + bairro.nome);
            strUtil.append("\n\tTem rio ?: " + (bairro.temRio ? "sim" : "não"));
            strUtil.append("\n\tCaracteristicas: " + bairro.qualidades);
        }

        return strUtil.toString();
    }



}