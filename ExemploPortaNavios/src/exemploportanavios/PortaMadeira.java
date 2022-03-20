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
public class PortaMadeira extends Navio {
    /**
    *<h1>Branches</h1>
    *<p>Criação e Alterações em branches</p>
    */
    //alteração do NovoBranch
    
    //outra alteração no NovoBranch
    
    public int num_max_toneladas;
/**
 * @param matricula 
 * passa parâmetro para o construtor da superclasse 
 */
      public PortaMadeira (String matricula) {
            super(matricula);
      }
/**
 * 
 * @return valor maximo de toneladas
 */
    public int getNum_max_toneladas() {
        return num_max_toneladas;
    }

    public void setNum_max_toneladas(int num_max_toneladas) {
        this.num_max_toneladas = num_max_toneladas;
    } 
    
    public String toString() {
        return "Porta-Madeira{" + "Matricula= " + matricula + ", Nome= " + nome + ", Comprimento= " + comprimento + ", Número Máximo de Toneladas= "+ num_max_toneladas +'}';
    }
}
