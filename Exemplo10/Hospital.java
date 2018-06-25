
package Exemplo10;

/**
 *
 * @author Guilherme Bialas
 */
public class Hospital {
   private String nome, cnpj, categoria;
   private double rendaAtual;
   private short ano;
   private boolean privado;

    public Hospital(String nome, String cnpj, String categoria, double rendaAtual, short ano, boolean privado) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.categoria = categoria;
        this.rendaAtual = rendaAtual;
        this.ano = ano;
        this.privado = privado;
    }
   
   
}
