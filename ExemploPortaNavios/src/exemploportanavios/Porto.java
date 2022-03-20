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
    
    public Porto(){
        navios = new ArrayList<>();
    }
    
    void inserir(Navio n) {
        if(buscar(n.matricula) == null)    
        navios.add(n);
    }
    
    public Navio buscar(String matricula){
        for(Navio n:navios)
            if(matricula == n.matricula)
                return n;
        return null;
    }
    
    public void listar(){
        for(Navio n: navios)
            System.out.println(n);  
    }
}
