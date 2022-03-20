/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploportanavios;

import java.util.ArrayList;

/**
 *
 * @author rafar
 */
public class Porto {
     public ArrayList<Navio> navios;
    
     /**
      * cria um array de navios
      */
    public Porto(){
        navios = new ArrayList<>();
    }
    
    /**
     * Inserir um navio 
     * @param n 
     */
    void inserir(Navio n) {
        if(buscar(n.matricula) == null)    
        navios.add(n);
    }
    
    /**
     * Pesquisar navio por matricula
     * @param matricula
     * @return retorna o navio caso exista senão devolve um null
     */
    public Navio buscar(String matricula){
        for(Navio n:navios)
            if(matricula == n.matricula)
                return n;
        return null;
    }
    
    /**
     * Lista os navios todos contidos no array
     */
    public void listar(){
        for(Navio n: navios)
            System.out.println(n);  
    }
}
