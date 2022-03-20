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
public class Petroleiro extends Navio{
    
    public float capacidade_carga;

    /**
     * passa parâmetro para o construtor da superclasse
     * @param matricula 
     */
    public Petroleiro(String matricula) {
        super(matricula);
    }

    /**
     * 
     * @return a capacidade da carga do petroleito
     */
    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(float capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }
    
    public String toString() {
        return "Petroleiro{" + "Matricula= " + matricula + ", Nome= " + nome + ", Comprimento= " + comprimento + ", Capacidade Carga= "+ capacidade_carga + " toneladas" +'}';
    }
    
}
