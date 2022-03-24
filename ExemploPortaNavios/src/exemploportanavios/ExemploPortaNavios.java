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
public class ExemploPortaNavios {

    /**
     * @param args the command line arguments
     * <p>ExemploPortaNavios main class!</p>
     */
    public static void main(String[] args) {
        
        //Primeiro Branch criado
        
        Porto p= new Porto();
        Navio n;
        Petroleiro np;
        PortaContentores npc;
        
        //alteracao dia 24/03
        n = new Navio("12-MC-12");
        n.setNome("Navio-1");
        n.setComprimento(50);
        p.inserir(n);
        
        np = new Petroleiro("14-PT-14");
        np.setNome("Petroleiro-1");
        np.setComprimento(80);
        np.capacidade_carga = 5;
        p.inserir(np);
        
        npc = new PortaContentores("16-PC-16");
        npc.setNome("PortaContentores-1");
        npc.setComprimento(80);
        npc.num_max_contentores = 10;
        p.inserir(npc);
        
        npc = new PortaContentores("16-PC-16");
        npc.setNome("PortaContentores-2");
        npc.setComprimento(80);
        npc.num_max_contentores = 1;
        p.inserir(npc);
        
        System.out.println("Porto de Navios:");
        
        p.listar();
    }
    
}
