/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploportanavios;

/**
 *
 * @author rafar
 */
public class Navio {
     public String matricula;
    public String nome;
    public float comprimento;
    
    /**
     * construtor do "Navio"
     * @param matricula 
     * 
     */
    public Navio(String matricula){
        this.matricula = matricula;
        nome = null;
        comprimento = 0;
    }
/**
 * 
 * @return nome do navio
 */
    public String getNome() {
        return nome;
    }
    
/**
 * 
 * @param nome 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @return o comprimento do navio
     */
    public float getComprimento() {
        return comprimento;
    }
    
    /**
     * 
     * @param comprimento 
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    @Override
    public String toString() {
        return "Navio{" + "Matricula=" + matricula + ", Nome=" + nome + ", Comprimento=" + comprimento + '}';
    }
}
